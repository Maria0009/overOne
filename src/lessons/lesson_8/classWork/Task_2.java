//Посчитать сумму четных, нечетных и всех чисел
package lessons.lesson_8.classWork;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter max number:");
        int limit = scanner.nextInt();
        int sumEven = 0;
        int sumOdd = 0;
        int result;
        for (int i=0;i <= limit;i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }
        result = sumEven + sumOdd;
        System.out.println("Sum of even number: " + sumEven);
        System.out.println("Sum of odd number: " + sumOdd);
        System.out.println("Sum: " + result);

    }
}
