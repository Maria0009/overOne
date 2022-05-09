package lessons.lesson_13.homeWork;

import java.util.Arrays;
import java.util.Scanner;

//Проверить, являются ли массивы идентичными
public class Task_9_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length array:");
        int size = scanner.nextInt();
        System.out.println("Enter array:");
        int[] arrayFirst = initArray(scanner, size);
        System.out.println("Enter array:");
        int[] arraySecond = initArray(scanner, size);
        boolean flag = identityVerification(arrayFirst, arraySecond, size);
        if (flag == true) {
            System.out.println("arrays identical");
        } else {
            System.out.println("arrays not identical");
        }
//or
        boolean result = Arrays.equals(arrayFirst, arraySecond);
        System.out.println(result);
    }

    static int[] initArray(Scanner scanner, int size) {
        int[] arrayFirst = new int[size];
        for (int i = 0; i < arrayFirst.length; i++) {
            arrayFirst[i] = scanner.nextInt();
        }
        return arrayFirst;
    }

    //flag name does not say anything to me. Think about better naming, which illustrates what this method does
    static boolean identityVerification(int[] arrayFirst, int[] arraySecond, int size) {
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

