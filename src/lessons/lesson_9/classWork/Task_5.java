//Есть массив чисел.  Пользователь вводит число. Определить, есть ли это число в массиве. Решить используя while
package lessons.lesson_9.classWork;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array`s length: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        System.out.println("Enter arrays");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        int i = 0;
        while (i < length) {
            if (number == array[i]) {
                System.out.print("The number " + number + " is in array");
                break;
            }
            if (i == array.length - 1) {
                System.out.println("The number " + number + " is not in array");
            }
            i++;
        }

/*        Scanner scanner = new Scanner(System.in);
        int[] anArray = {1, 2, 3, 6, 8, 4, 45, 12, 46, 7, 20};
        int i = 0;
        System.out.println("Введи число которое сравним с массивом");
        int userIn = scanner.nextInt();
        do {
            if (userIn == anArray[i]) {
                System.out.println("В массиве есть число " + anArray[i]);
                break;
            }
            if(i==anArray.length-1) {
                System.out.println("В массиве нет числа " + userIn);
            }
            i++;
        } while (i < anArray.length);
*/


    }
}

