//Заполнить массив рандомными числами. Отсортировать его и вывести максимальный и минимальный элемент
package lessons.lesson_11.homeWork;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length array:");
        int size = scanner.nextInt();
        System.out.println("Entered array:");
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            //array[i] = (int) (Math.random()* 100 - 50);// от -50 до 49
            array[i] = random.nextInt(21) - 10;//от минус 10 до 10
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Sort:");
        int max = array[0];
        int min = array[0];
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}

