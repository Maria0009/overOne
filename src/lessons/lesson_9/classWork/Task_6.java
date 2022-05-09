//Есть массив слов. Нужно инвертировать его порядок.
package lessons.lesson_9.classWork;

import java.util.Arrays;
import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        //Алгоритм для присваивания ячейкам индексов этих яеек в обратном порядке
        //       for (int i = 0; i < array.length ; i++) {
        //           array[i]= array.length-1-i;
        //       }
        //Алгоритм для написания палиндроммов
        //       for (int i = 0; i < array.length/2; i++) {
        //           array[i]= array[array.length - 1 - i];
        //       }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array`s length: ");
        int length = scanner.nextInt();
        String[] array = new String[length];
        System.out.println("Enter arrays");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.next();
        }
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println(Arrays.toString(array));
//or
/*        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array`s length: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        System.out.println("Enter arrays");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int temp;
        for (int i = 0; i < array.length/2; i++) {
            temp=array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i]=temp;
        }
        System.out.println(Arrays.toString(array));
 */
//or
 /*       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array`s length: ");
        int length = scanner.nextInt();
        String[] array = new String[length];
        System.out.println("Enter arrays");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.next();
        }
        String temp;
        int j = array.length - 1;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            j--;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        //System.out.println(Arrays.toString(array));
 */
    }
}
