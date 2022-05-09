package lessons.lesson_8.classWork;

import java.util.Scanner;

//Реализуйте калькулятор с возможностью постоянного ввода числа («Хотите продолжить?»)
public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer;
        do {
            double firstNumber = initNumber(scanner);
            double secondNumber = initNumber(scanner);
            if (secondNumber == 0) {
                System.out.println("Division by 0 is forbidden");
            } else {
                String operation = initOperation(scanner);
                double result = findResult(firstNumber, secondNumber, operation);
                System.out.println("Result:" + result);
            }
            answer = initQuestion(scanner);
        }
        while (answer.equals("yes"));
        System.out.println("The end program!");
    }

    static String initOperation(Scanner scanner) {
        System.out.println("Enter operation:\n" +
                "'+' -Sum; \n" +
                "'-' -Difference; \n" +
                "'/' -Division; \n" +
                "'*' -Multiplication;");
        return scanner.next();
    }

    static double initNumber(Scanner scanner) {
        System.out.println("Enter a number:");
        return scanner.nextDouble();
    }

    static String initQuestion(Scanner scanner) {
        System.out.println("Continue? Enter: yes");
        return scanner.next();
    }

    static double findResult(double firstNum, double secondNum, String operation) {
        switch (operation) {
            case "+":
                return firstNum + secondNum;
            case "-":
                return firstNum - secondNum;
            case "*":
                return firstNum * secondNum;
            case "/":
                return firstNum / secondNum;
            default:
                System.out.println("Entered wrong operation!");
                return 0;
        }
    }


}
