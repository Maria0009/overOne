package lessons.lesson_13.homeWork;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Есть массив чисел. Разбить его пополам и поместить в соответствующие массивы. Предусмотреть нечетную длину!
public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length array:");
        int size = size(scanner);
        int[] array = new int[size];
        array = inputArray(array);
        System.out.println(Arrays.toString(array));
        if (size % 2 == 0) {
            evenSize(array);
        } else {
            oddSize(array);
        }

    }

    static int size(Scanner scanner) {
        return scanner.nextInt();
    }

    static int[] inputArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21) - 10;
        }
        return array;
    }
//better to return this size and then only print

    static void evenSize(int[] array) {
        int[] arrayFirst;
        int[] arraySecond;
        int k = 0;
        arrayFirst = new int[array.length / 2];
        arraySecond = new int[array.length / 2];
        for (int i = 0; i < array.length / 2; i++) {
            arrayFirst[k] = array[i];
            k++;
        }
        k = 0;
        for (int i = array.length / 2; i < array.length; i++) {
            arraySecond[k] = array[i];
            k++;
        }
        System.out.println(Arrays.toString(arrayFirst));
        System.out.println(Arrays.toString(arraySecond));
    }

    static void oddSize(int[] array) {
        int[] arrayFirst;
        int[] arraySecond;
        int k = 0;
        arrayFirst = new int[(array.length + 1) / 2];
        arraySecond = new int[(array.length - 1) / 2];
        for (int i = 0; i < (array.length + 1) / 2; i++) {
            arrayFirst[k] = array[i];
            k++;
        }
        k = 0;
        for (int i = (array.length + 1) / 2; i < array.length; i++) {
            arraySecond[k] = array[i];
            k++;
        }
        System.out.println(Arrays.toString(arrayFirst));
        System.out.println(Arrays.toString(arraySecond));
    }
}
