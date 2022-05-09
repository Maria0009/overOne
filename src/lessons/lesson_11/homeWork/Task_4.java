//Есть массив чисел. Разбить его пополам и поместить в соответствующие массивы. Предусмотреть нечетную длину!
package lessons.lesson_11.homeWork;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length array:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21) - 10;//от минус 10 до 10
        }
        System.out.println(Arrays.toString(array));
        int[] arrayFirst;
        int[] arraySecond;
        int k = 0;
        if (size % 2 == 0) {
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
        } else {
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
        }
        System.out.println(Arrays.toString(arrayFirst));
        System.out.println(Arrays.toString(arraySecond));

    }
}
