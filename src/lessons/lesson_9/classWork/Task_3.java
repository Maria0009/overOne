//Есть массив чисел. Найти среднее арифметическое число элементов массива
package lessons.lesson_9.classWork;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array`s length: ");
        int length = scanner.nextInt();
        double[] array = new double[length];
        double average;
        double sum = 0;
        System.out.println("Enter arrays");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextDouble();
            sum += array[i];
        }
        average = sum / length;
        System.out.println(average);
    }
}
