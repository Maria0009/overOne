//Найти сумму чисел Фибоначчи от 1 до n
package lessons.lesson_7.classWork;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum;
        int result = 2;
        int firstNumber = 1;
        int secondNumber = 1;
        System.out.print(firstNumber + " " + secondNumber + " ");
        for (int i = 2; i < number; i++) {
            sum = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = sum;
            result += sum;
            System.out.print(sum + " ");
        }
        System.out.println();
        System.out.println("Result: "+result);

    }
}
