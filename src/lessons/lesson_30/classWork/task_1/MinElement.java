package lessons.lesson_30.classWork.task_1;

public class MinElement extends Thread {

    private int[][] array;

    public MinElement(int[][] array) {
        this.array = array;
    }

    @Override
    public void run() {
        int mix = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < mix) {
                    mix = array[i][j];
                }
            }
        }
        System.out.println("Min: " + mix);
    }
}
