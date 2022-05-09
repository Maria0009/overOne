package lessons.lesson_13.homeWork;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Есть массив. Найти максимально возможную сумму и минимальную разность элементов
public class Task_5_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length array:");
        int size = initSize(scanner);
        System.out.println("Entered array:");
        int[] array = new int[size];
        int[] inArray = initArray(array);
        System.out.println(Arrays.toString(inArray));
        System.out.println("Sort:");
        int[] sort = sort(array);
        System.out.println(Arrays.toString(sort));
        int maxSum = array[array.length - 1] + array[array.length - 2];
        int minDiff = array[0] - array[array.length - 1];
        System.out.println(maxSum);
        System.out.println(minDiff);
    }

    private static int initSize(Scanner scanner) {
        return scanner.nextInt();
    }

    static int[] initArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21) - 10;
        }
        return array;
    }

    //sort
    static int[] sort(int[] array) {
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
        return array;
    }


}


