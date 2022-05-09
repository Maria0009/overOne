package lessons.lesson_30.homeWork.task_1;

import java.util.List;

public class First extends Thread {
    private List<Integer> list;

    public First(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        int max1 = list.get(0);
        if (max1 == max) {
            max1 = list.get(1);
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == max) {
                continue;
            } else if (max1 < list.get(i)) {
                max1 = list.get(i);
            }
        }
        System.out.println("Second max: " + max1);
    }
}
