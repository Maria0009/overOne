//Есть массив. Найти максимально возможную сумму и минимальную разность элементов
package lessons.lesson_11.homeWork;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length array:");
        int size = scanner.nextInt();
        System.out.println("Entered array:");
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            //array[i] = (int) (Math.random()* 100 - 50);// от -50 до 99
            array[i] = random.nextInt(21) - 10;//от минус 10 до 10
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Sort:");
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
        int maxSum = array[array.length - 1] + array[array.length - 2];
        int minDiff = array[0] - array[array.length - 1];
        System.out.println(maxSum);
        System.out.println(minDiff);
    }
}
