package lessons.lesson_30.homeWork.task_1;

import java.util.List;

public class Second extends Thread {
    private List<Integer> list;

    public Second(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        int min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (min > list.get(i)) {
                min = list.get(i);
            }
        }
        int min1 = list.get(0);
        if (min1 == min) {
            min1 = list.get(1);
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == min) {
                continue;
            } else if (min1 > list.get(i)) {
                min1 = list.get(i);
            }
        }
        System.out.println("Second min: " + min1);
    }
}
