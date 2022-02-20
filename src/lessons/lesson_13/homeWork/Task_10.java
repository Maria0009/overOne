package lessons.lesson_13.homeWork;

import java.util.Scanner;

//найти сумму в определенном диапазоне (задаем start и end)
public class Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter start range:");
        int start = parameterStart(scanner);
        System.out.println("Enter end range:");
        int end = parameterEnd(scanner);
        if (start < end) {
            System.out.println("Sum range [" + start + " " + end + "]");
            int result = sum(start, end);
            System.out.println(result);
        } else {
            System.out.println("Error range!");
        }
    }

    static int parameterStart(Scanner scanner) {
        return scanner.nextInt();
    }

    static int parameterEnd(Scanner scanner) {
        return scanner.nextInt();
    }

    static int sum(int start, int end) {
        if (start <= end) {
            return start + sum(start + 1, end);
        } else {
            return 0;
        }
    }

}
