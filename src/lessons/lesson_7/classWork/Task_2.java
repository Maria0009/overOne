//Калькулятор. Пользователь вводит 2 числа.  После выполнения операций спросить, хочет ли продолжить,
// если да – заново, иначе завершаем программу.
package lessons.lesson_7.classWork;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Enter first number:");
            double numFirst1 = scanner.nextDouble();
            System.out.println("Enter second number:");
            double numSecond1 = scanner.nextDouble();
            if (numSecond1 != 0) {
                System.out.println("Enter operation " +
                        "'+' -Sum; " +
                        "'-' -Difference; " +
                        "'/' -Division; " +
                        "'*' -Multiplication;");
                String c = scanner.next();
                double result;
                switch (c) {
                    case "+":
                        result = numFirst1 + numSecond1;
                        System.out.println("Result::" + result);
                        break;
                    case "-":
                        result = numFirst1 - numSecond1;
                        System.out.println("Result:" + result);
                        break;
                    case "/":
                        result = numFirst1 / numSecond1;
                        System.out.println("Result:" + result);
                        break;
                    case "*":
                        result = numFirst1 * numSecond1;
                        System.out.println("Result:" + result);
                        break;
                    default:
                        System.out.println("Entered wrong operation!");
                        break;
                }
            } else {
                System.out.println("Division by 0 is forbidden");
            }
            System.out.println("Continue?");
            answer = scanner.next();
        }
        while (answer.equals("yes"));
        System.out.println("The end program!");


    }
}
