//Удалить из массива определенное число
package lessons.lesson_11.homeWork;

import java.util.Arrays;
import java.util.Scanner;

public class Task_6 {
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
        int length = size;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                length--;
            }
        }
        int[] newArray = new int[length];
        int k = 0;
        for (int temp:  array) {
            if (temp != number) {
                newArray[k] = temp;
                k++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(newArray));
    }
}
