//Реализуйте калькулятор с возможностью постоянного ввода числа («Хотите продолжить?»)
package lessons.lesson_8.classWork;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Enter first number:");
            double numFirst1 = scanner.nextDouble();
            System.out.println("Enter second number:");
            double numSecond1 = scanner.nextDouble();
            //it would be better to check firstly for ==0 {System.out.println("Division by 0 is forbidden")}else{...} Does not affect on result, but more beautiful:)
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
            System.out.println("Continue? Enter: yes");
            answer = scanner.next();
        }
        while (answer.equals("yes"));
        System.out.println("The end program!");
    }
}
