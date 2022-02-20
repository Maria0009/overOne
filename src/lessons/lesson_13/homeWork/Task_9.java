package lessons.lesson_13.homeWork;

import java.util.Arrays;
import java.util.Scanner;

//Проверить, являются ли массивы идентичными
public class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length array:");
        int size = scanner.nextInt();
        System.out.println("Enter array:");
        int[] arrayFirst = arrayFirst(scanner, size);
        System.out.println("Enter array:");
        int[] arraySecond = arraySecond(scanner, size);
        boolean flag = flag(arrayFirst, arraySecond, size);
        if (flag == true) {
            System.out.println("arrays identical");
        } else {
            System.out.println("arrays not identical");
        }
//or
        boolean result = Arrays.equals(arrayFirst, arraySecond);
        System.out.println(result);
    }

    static int[] arrayFirst(Scanner scanner, int size) {
        int[] arrayFirst = new int[size];
        for (int i = 0; i < arrayFirst.length; i++) {
            arrayFirst[i] = scanner.nextInt();
        }
        return arrayFirst;
    }

    static int[] arraySecond(Scanner scanner, int size) {
        int[] arraySecond = new int[size];
        for (int i = 0; i < arraySecond.length; i++) {
            arraySecond[i] = scanner.nextInt();
        }
        return arraySecond;
    }

    static boolean flag(int[] arrayFirst, int[] arraySecond, int size) {
        boolean flag = true;
        for (int i = 0; i < size; i++) {
            if (arrayFirst[i] != arraySecond[i]) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
