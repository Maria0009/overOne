package lessons.lesson_11.classWork;

import java.util.Scanner;
public class Task_2 {
    public static void main(String[] args) {
//Линейный алгоритм
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length array:");
        int size = scanner.nextInt();
        System.out.println("Enter array:");
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter number");
        int number = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
