package lessons.lesson_13.homeWork;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Есть массив чисел. Разбить его пополам и поместить в соответствующие массивы. Предусмотреть нечетную длину!
public class Task_4_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length array:");
        int size = size(scanner);
        int[] array = new int[size];
        inputArray(array);
        System.out.println(Arrays.toString(array));
        int[] arrayFirst;
        int[] arraySecond;
        if (size % 2 == 0) {
            arrayFirst = new int[array.length / 2];
            arraySecond = new int[array.length / 2];
        } else {
            arrayFirst = new int[(array.length + 1) / 2];
            arraySecond = new int[(array.length - 1) / 2];
        }
            printArray(array, arrayFirst, arraySecond);

    }

    static int size(Scanner scanner) {
        return scanner.nextInt();
    }

    static void inputArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21) - 10;
        }
    }
//better to return this size and then only print

    static void printArray(int[] array, int[] arrayFirst, int[] arraySecond) {
        int k = 0;
        for (int i = 0; i < arrayFirst.length; i++) {
            arrayFirst[i] = array[k];
            k++;
        }
        for (int i = 0; i < arraySecond.length; i++) {
            arraySecond[i] = array[k];
            k++;
        }
        System.out.println(Arrays.toString(arrayFirst));
        System.out.println(Arrays.toString(arraySecond));
    }
}

