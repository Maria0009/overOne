//Проверить, являются ли массивы идентичными
package lessons.lesson_11.homeWork;

import java.util.Arrays;
import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length array:");
        int size = scanner.nextInt();
        System.out.println("Enter array:");
        int[] arrayFirst = new int[size];
        for (int i = 0; i < arrayFirst.length; i++) {
            arrayFirst[i] = scanner.nextInt();
        }
        System.out.println("Enter array:");
        int[] arraySecond = new int[size];
        for (int i = 0; i < arraySecond.length; i++) {
            arraySecond[i] = scanner.nextInt();
        }
        boolean flag = true;
        for (int i = 0; i < size; i++) {
            if (arrayFirst[i] != arraySecond[i]) {
                flag = false;
                break;
            }
        }
        if (flag == true) {
            System.out.println("arrays identical");
        } else {
            System.out.println("arrays not identical");
        }
//or
        boolean result = Arrays.equals(arrayFirst, arraySecond);
        System.out.println(result);
    }
}
