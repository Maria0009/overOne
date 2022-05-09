package lessons.lesson_13.homeWork;

import java.util.Arrays;
import java.util.Scanner;

import java.util.Scanner;

//methods size and number do same actions. It's 1 method!
//Удалить из массива определенное число
public class Task_6_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length array:");
        int size = initNumber(scanner);
        int[] array = new int[size];
        System.out.println("Enter array:");
        int[] inArray = initArray(scanner, array);
        System.out.println("Enter number:");
        int number = initNumber(scanner);
        int newLengthArray = newLength(size, inArray, number);
        int[] newArray = new int[newLengthArray];
        outArray(inArray, number, newArray);
    }

    static int initNumber(Scanner scanner) {
        return scanner.nextInt();
    }

    static int[] initArray(Scanner scanner, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    static int newLength(int size, int[] array, int number) {
        int length = size;
        for (int j : array) {
            if (j == number) {
                length--;
            }
        }
        return length;
    }

    static void outArray(int[] inArray, int number, int[] newArray) {
        int k = 0;
        for (int temp : inArray) {
            if (temp != number) {
                newArray[k] = temp;
                k++;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }

}

