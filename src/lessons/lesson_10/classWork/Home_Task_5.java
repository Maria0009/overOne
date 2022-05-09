package lessons.lesson_10.classWork;

import java.util.Scanner;
//+
//+, but there is more efficient solution :)
public class Home_Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length array:");
        int size = scanner.nextInt();
        System.out.println("Enter array:");
        int[][] array = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        int sum = 0;
        System.out.println("Entered array:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
                if (i == j) {
                    sum += array[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("Sum: " + sum);

    }
}
