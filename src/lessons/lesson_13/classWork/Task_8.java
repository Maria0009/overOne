package lessons.lesson_13.classWork;

import java.util.Arrays;
import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size array");
        int[] array = new int[initSize(scanner)];
        int[] initArray = initArray(scanner, array);
        outArray(initArray);
    }

    static int initSize(Scanner scanner) {
        int size = scanner.nextInt();
        if (size < 0) {
            System.out.println("Error");
            initSize(scanner);
        }
        return size;
    }

    static int[] initArray(Scanner scanner, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    static void outArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}




