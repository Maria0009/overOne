//При помощи класса сканер и пользователя заполнить массив.
package lessons.lesson_9.classWork;

import java.util.Scanner;

public class Task_2 {
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
    }
}
