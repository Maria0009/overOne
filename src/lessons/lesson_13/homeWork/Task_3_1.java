package lessons.lesson_13.homeWork;

import java.util.Arrays;
import java.util.Scanner;

//Заполнить массив рандомными числами. Вывести второй максимальный и минимальный элемент
public class Task_3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length array:");
        int size = initSize(scanner);
        System.out.println("Entered array:");
        int[] array = new int[size];
        array = inputArray(array);
        System.out.println(Arrays.toString(array));
        System.out.println(max(array));
        System.out.println(min(array));
    }

    //initSize
    static int initSize(Scanner scanner) {
        return scanner.nextInt();
    }

    static int[] inputArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100 - 50);
        }
        return array;
    }

    static int max(int[] array) {
        int max = array[0];
        int second = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                second = max;
                max = array[i];
            } else if (array[i] > second && array[i] != max) {
                second = array[i];
            }
        }
        return second;
    }

    static int min(int[] array) {
        int min = array[0];
        int third = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                third = min;
                min = array[i];
            } else if (array[i] < third && array[i] != min) {
                third = array[i];
            }
        }
        return third;
    }
}

