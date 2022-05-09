//Заполнить массив с консоли (предусмотреть исключительные ситуации) Если пользователь во время заполнения массива вводит отрицательное
// число, то инициализацию массива прекратить, вывести сообщение и закончить программу.Вывести полученный массив с помощью foreach.
package lessons.lesson_11.homeWork;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size array");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter array elements");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
            if (array[i] < 0) {
                System.out.println("You entered negative element");
                return;
            }
        }
        for (int temp : array) {
            System.out.print(temp + " ");
        }
    }
}
