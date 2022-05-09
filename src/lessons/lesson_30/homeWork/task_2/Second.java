package lessons.lesson_30.homeWork.task_2;

public class Second extends Thread {
    private int[] array;

    public Second(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        int min1 = array[0];
        if (min1 == min) {
            min1 = array[1];
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                continue;
            } else if (min1 > array[i]) {
                min1 = array[i];
            }
        }
        System.out.println(min1);
    }
}
