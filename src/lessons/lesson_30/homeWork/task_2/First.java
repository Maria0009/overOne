package lessons.lesson_30.homeWork.task_2;

public class First extends Thread {
    private int[] array;

    public First(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        int max1 = array[0];
        if (max1 == max) {
            max1 = array[1];
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                continue;
            } else if (max1 < array[i]) {
                max1 = array[i];
            }
        }
        System.out.println(max1);
    }
}
