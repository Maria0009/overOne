package lessons.lesson_30.classWork.task_1;

import java.util.Scanner;

public class Matrix1 extends Thread {
    private int[][] array;

    public Matrix1(int[][] array) {
        this.array = array;
    }

    @Override
    public void run() {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Main diagonal: " + array[i][i]);
        }
    }
}

