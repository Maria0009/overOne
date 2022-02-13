package lessons.lesson_8.homeWork;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter max number for multiplication table: ");
        int number = scanner.nextInt();
        System.out.println("You typed in " + number);
        int multiplication;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                multiplication = i * j;
                if (multiplication < 10) {
                    System.out.print(" ");
                }
                System.out.print(multiplication + " ");
            }
            System.out.println();
        }
        System.out.println("Are you happy? (y/n)");
        String answer = scanner.next();
        if (answer.equals("y")) {
            System.out.println("I am glad!");
        }
    }
}
