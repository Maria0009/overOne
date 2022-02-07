//Создать Jagged Array (т.е число элементов в каждом под массиве двумерного массива может отличаться)
//с помощью пользователя и сканера. Пример такого массива: int[][] myArray = {{1,2,3}, {56},{1,2,6,1,3,1,3},{2,2}};
package lessons.lesson_10.homeWork;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length array:");
        int size = scanner.nextInt();
        int[][] array = new int[size][];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter length array for " + i + " row");
            int lengthRow = scanner.nextInt();
            array[i] = new int[lengthRow];
        }
        System.out.println("Enter array:");
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
    }
}
