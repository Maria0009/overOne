package lessons.lesson_12.classWork;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter size array");
//        int size = scanner.nextInt();
//        int[] array = new int[size];
//        System.out.println("Enter number:");
//        int number = scanner.nextInt();
//        int counter = 0;
//        System.out.println("Enter array elements");
//        for (int i = 0; i < size; i++) {
//            array[i] = scanner.nextInt();
//        }
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] > 0 && array[i] % number == 0) {
//                counter++;
//                System.out.print(array[i] + " ");
//            }
//        }
//        System.out.println();
//        System.out.println("Counter " + counter);
        Scanner scanner = new Scanner(System.in);
        int[] startArray = new int[scanner.nextInt()];

        Random random = new Random();

        for (int i = 0; i < startArray.length; i++) {
            startArray[i] = random.nextInt(10)+1;
        }
        System.out.println(Arrays.toString(startArray));
    }
}

