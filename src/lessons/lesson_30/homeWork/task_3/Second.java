package lessons.lesson_30.homeWork.task_3;

public class Second extends Thread {
    private int[] array;

    public Second(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        try {
            sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 1; i < array.length; i += 2) {
            System.out.println(array[i]);
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
