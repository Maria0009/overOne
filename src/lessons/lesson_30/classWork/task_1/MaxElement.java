package lessons.lesson_30.classWork.task_1;

//Написать программу которая заполняет массив 100 000 рандомными числами от 0 до 100
// найти максимальный и минимальный элементы массива с помощью двух разных потоков
public class MaxElement extends Thread {

    private int[][] array;

    public MaxElement(int[][] array) {
        this.array = array;
    }

    @Override
    public void run() {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Max: " + max);
    }
}
