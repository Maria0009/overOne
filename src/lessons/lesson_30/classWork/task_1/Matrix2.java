package lessons.lesson_30.classWork.task_1;

public class Matrix2 extends Thread {
    private int[][] array;

    public Matrix2(int[][] array) {
        this.array = array;
    }

    @Override
    public void run() {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Secondary diagonal: " + array[i][array.length - i - 1]);
        }
    }
}
