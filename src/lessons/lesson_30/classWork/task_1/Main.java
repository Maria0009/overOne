package lessons.lesson_30.classWork.task_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] array = new int[50][50];
        int a = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 101);
                a++;
            }
        }
        System.out.println(Arrays.deepToString(array));
        Matrix1 matrix1 = new Matrix1(array);
        Matrix2 matrix2 = new Matrix2(array);
        MaxElement maxElement = new MaxElement(array);
        MinElement minElement = new MinElement(array);
        Average average = new Average(array);

        matrix1.start();
        matrix2.start();
        maxElement.start();
        minElement.start();
        average.start();
    }

}
