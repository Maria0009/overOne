package lessons.lesson_30.classWork.task_1;

public class Average extends Thread {
    private int[][] array;

    public Average(int[][] array) {
        this.array = array;
    }

    @Override
    public void run() {
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                average += array[i][j];
            }
        }
        average /= (array.length * array.length);
        System.out.println("Average: " + average);
    }
}
