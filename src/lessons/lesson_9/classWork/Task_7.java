//Есть массив чисел. Необходимо создать другой массив содержащий только четные элементы из первого
package lessons.lesson_9.classWork;

import java.util.Arrays;
import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array`s length: ");
        int length = scanner.nextInt();
        int[] array = new int[length];//можно счетчик четных элементов создать (повтор блока кода)
        int[] newArray = new int[length];
        System.out.println("Enter arrays");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("New array: ");
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                newArray[j] = array[i];
                System.out.print(newArray[j] + " ");
                j++;
            }
        }
        //System.out.println(Arrays.toString(newArray));

    }
}
