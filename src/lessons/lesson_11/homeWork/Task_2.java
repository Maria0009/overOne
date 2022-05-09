//вывести числа которые являются положительными и кратными числу, которое ввел пользователь. Вывести количество совпадений
package lessons.lesson_11.homeWork;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length array:");
        int size = scanner.nextInt();
        System.out.println("Enter array:");
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter number:");
        int number = scanner.nextInt();
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] % number == 0) {
                counter++;
                System.out.print(array[i]+" ");
            }
        }
        System.out.println();
        System.out.println("Number of coincidences " + counter);
    }
}
