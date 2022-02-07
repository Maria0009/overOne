//Пользователь вводит размерности двумерного массива
// (прямоугольный, все строки одинаковой длины !=числу столбцов) и заполняет (через сканнер)
package lessons.lesson_10.homeWork;

import java.util.Scanner;
//+
public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows and number of columns in the matrix:");
        int numberRows = scanner.nextInt();
        int numberColumns = scanner.nextInt();
        int[][] array = new int[numberRows][numberColumns];
        System.out.println("Enter matrix:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Entered matrix");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
