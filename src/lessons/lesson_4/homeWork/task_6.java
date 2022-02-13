//Реализуем калькулятор:
package lessons.lesson_4.homeWork;

import java.util.Scanner;

public class task_6 {
    public static void main(String[] args) {
        //First version
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        double numberFirst=scanner.nextDouble();
        System.out.println("Enter second number:");
        double numberSecond=scanner.nextDouble();
        if (numberSecond != 0) {
            System.out.println("Enter operation " +
                    "'1' -Sum; " +
                    "'2' -Difference; " +
                    "'3' -Division; " +
                    "'4' -Multiplication;");
            //Why do wee need to use char? We can use int either: enter just 1,2,.. without ''
            int operat = scanner.nextInt();
            //If we do not have number we will get into default section
            //char operat = scanner.next().charAt(0);//исспользовала char для ситуации: если пользователь введет символ (число), которого у нас нет)
            double result1;
            switch (operat) {
                case 1:
                    result1 = numberFirst + numberSecond;
                    System.out.println("Result:" + result1);
                    break;
                case 2:
                    result1 = numberFirst - numberSecond;
                    System.out.println("Result:" + result1);
                    break;
                case 3:
                    result1 = numberFirst / numberSecond;
                    System.out.println("Result:" + result1);
                    break;
                case 4:
                    result1 = numberFirst * numberSecond;
                    System.out.println("Result:" + result1);
                    break;
                default:
                    System.out.println("Entered wrong operation!");
                    break;
            }
        }
        else {
            System.out.println("Division by 0 is forbidden");
        }

        //Second version
        //+

        System.out.println("Enter first number:");
        double numFirst=scanner.nextDouble();
        System.out.println("Enter second number:");
        double numSecond=scanner.nextDouble();
        if (numSecond != 0) {
            System.out.println("Enter operation " +
                    "'+' -Sum; " +
                    "'-' -Difference; " +
                    "'/' -Division; " +
                    "'*' -Multiplication;");
            //We can use String either. Just write default section (else) for any other cases. char ok too.
            char c = scanner.next().charAt(0);// ввод одного символа
            if (c == '+') {
                double result = numFirst + numSecond;
                System.out.println("Result::" + result);
            } else if (c == '-') {
                double result = numFirst - numSecond;
                System.out.print("Result:" + result);
            } else if (c == '/') {
                double result = numFirst / numSecond;
                System.out.print("Result:" + result);
            } else if (c == '*') {
                double result = numFirst * numSecond;
                System.out.print("Result:" + result);
            }
            else{
                System.out.println("Entered wrong operation!");
            }
        }
        else {
            System.out.println("Division by 0 is forbidden");
        }

        //Third version
        System.out.println("Enter first number:");
        double numFirst1=scanner.nextDouble();
        System.out.println("Enter second number:");
        double numSecond1=scanner.nextDouble();
        if (numSecond1 != 0) {
            System.out.println("Enter operation " +
                    "'+' -Sum; " +
                    "'-' -Difference; " +
                    "'/' -Division; " +
                    "'*' -Multiplication;");
            //We can use String either. Just write default section (else) for any other cases. char ok too.
            String c = scanner.next();
            double result;
            switch (c) {
                case "+":
                    result= numFirst1 + numSecond1;
                    System.out.println("Result::" + result);
                    break;
                case "-":
                    result = numFirst1 - numSecond1;
                    System.out.print("Result:" + result);
                    break;
                case "/":
                    result = numFirst1 / numSecond1;
                    System.out.print("Result:" + result);
                    break;
                case "*":
                    result = numFirst1 * numSecond1;
                    System.out.print("Result:" + result);
                    break;
                default:
                    System.out.println("Entered wrong operation!");
                    break;
            }
        }
        else {
            System.out.println("Division by 0 is forbidden");
        }
    }
}
