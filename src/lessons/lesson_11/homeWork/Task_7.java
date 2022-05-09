//Скопировать массив в другой
package lessons.lesson_11.homeWork;

import java.util.Arrays;
import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length array:");
        int size = scanner.nextInt();
        System.out.println("Enter array:");
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
//        int[] arrayNew=null;
//        arrayNew= Arrays.copyOf(array,array.length);
//        System.out.println(Arrays.toString(arrayNew));
        //or
        int[] arrayNew = new int[size];
        int k = 0;
        for (int temp : array) {
            arrayNew[k] = temp;
            k++;
        }
        System.out.println(Arrays.toString(arrayNew));

    }
}
