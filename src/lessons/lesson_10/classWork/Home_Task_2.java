package lessons.lesson_10.classWork;

import java.util.Scanner;

//Вывести таблицу умножения используя двумерный массив
public class Home_Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size in the matrix:");
        int size = scanner.nextInt();
        int[][] array = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (i + 1) * (j + 1);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
