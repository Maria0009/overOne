//Даны числа от 0 до 100.
// - Посчитать сумму четных и вывести на экран
// - Посчитать сумму нечетных и вывести на экран
// - Найти общую сумму всех чисел
package lessons.lesson_6.homeWork;

public class Task_4 {
    public static void main(String[] args) {
        final int LIMIT = 100;
        int i = 0;
        int sum = 0;
        System.out.println("Sum of even number:");
        while (i <= LIMIT) {
//you could in else find the sum of odd numbers either and do not use extra loop
            if (i % 2 == 0) {
                sum += i;
//                System.out.println(i + " - " + sum);
            }
            i++;
        }
        System.out.println(sum);
        System.out.println();
        sum = 0;
        i = 0;
        System.out.println("Sum of uneven number:");
        while (i <= LIMIT) {
            if (i % 2 != 0) {
                sum += i;
//                System.out.println(i + " - " + sum);
            }
            i++;
        }
        System.out.println(sum);
        System.out.println();
        sum = 0;
        i = 0;
        //simplify it. You have already found sum of even and odd numbers. You do not need it
        System.out.println("Sum from 1 to 100:");
        while (i <= LIMIT) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
