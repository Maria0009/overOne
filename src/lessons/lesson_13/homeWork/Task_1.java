package lessons.lesson_13.homeWork;

import java.util.Arrays;
import java.util.Scanner;

//Заполнить массив с консоли. Если пользователь во время заполнения массива вводит отрицательное
// число, то инициализацию массива прекратить, вывести сообщение и закончить программу.Вывести полученный массив с помощью foreach.
public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size array");
        int size = sizeArrays(scanner);
        int[] array = new int[size];
        System.out.println("Enter array elements");
        boolean negative = inputArray(scanner, array);
        if (!negative) {
            outputArray(array);
        }
    }

    static int sizeArrays(Scanner scanner) {
        return scanner.nextInt();
    }

    static boolean inputArray(Scanner scanner, int[] array) {
        boolean negativeNumber = false;
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            if (array[i] < 0) {
                System.out.println("You entered negative element!");
                negativeNumber = true;
                break;
            }
        }
        return negativeNumber;

    }

    static void outputArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
