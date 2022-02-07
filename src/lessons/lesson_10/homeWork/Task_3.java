//Есть матрица. Найти в ней введенное пользователем число и вывести номер столбца и строки
package lessons.lesson_10.homeWork;

import java.util.Scanner;
//+
public class Task_3 {
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
        System.out.println("Entered array:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Enter number");
        int number = scanner.nextInt();
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (number == array[i][j]) {
                    System.out.println("Row number is: " + i + " and column number is: " + j);
                    counter++;
                }
            }
        }
        if (counter == 0) {
            System.out.println("The number  not found.");
        }
    }
}
