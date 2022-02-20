package lessons.lesson_13.homeWork;

import java.util.Arrays;
import java.util.Scanner;

//Скопировать массив в другой
public class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length array:");
        int sizeArray = size(scanner);
        int[] array = new int[sizeArray];
        System.out.println("Enter array:");
        initArray(scanner, array);
        int[] arrayNew = copyArray(sizeArray, array);
        System.out.println(Arrays.toString(arrayNew));
        //or
        int[] newArray = arrayCopyOf(array);
        System.out.println(Arrays.toString(newArray));
    }

    static int size(Scanner scanner) {
        return scanner.nextInt();
    }

    static void initArray(Scanner scanner, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
    }

    static int[] copyArray(int sizeArray, int[] array) {
        int[] arrayNew = new int[sizeArray];
        int k = 0;
        for (int temp : array) {
            arrayNew[k] = temp;
            k++;
        }
        return arrayNew;
    }

    static int[] arrayCopyOf(int[] array) {
//this two lines can be combined or simply return Arrays.copyOf(array, array.length)
        int[] newArray = null;
        newArray = Arrays.copyOf(array, array.length);
        return newArray;
    }

}
