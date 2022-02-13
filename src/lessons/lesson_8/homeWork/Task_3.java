package lessons.lesson_8.homeWork;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 3;
        int random = (int) (Math.random() * 10);
        do {
            System.out.print("I`m thinking about a number between 0 and 9" +
                    "Can you guess it? (" + counter + " attempt(s) left):");
            int number = scanner.nextInt();
            if (random == number) {
                System.out.println("Congratulations! That was the correct number.");
                break;
            } else {
                System.out.println("Sorry. Wrong number.");
                counter--;
            }
        } while (counter > 0);
        if (counter == 0) {
            System.out.println("The correct number is " + random);
        }
    }
}
