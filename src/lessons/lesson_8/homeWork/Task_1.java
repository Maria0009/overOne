package lessons.lesson_8.homeWork;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you like Java programming? (y/n)");
        String answer = scanner.nextLine();
        if (answer.equals("y")) {
            System.out.println("I like Java programming too! We are so similar to you!");
        } else {
            System.out.println("Are you sure you don`t like Java programming?");
            answer = scanner.nextLine();
            String really = "really";
            int counter = 5;
            do {
                if (answer.equals("n")) {
                    System.out.println("Hope you`ll get to like it soon..");
                    break;
                } else {
                    System.out.println("Are you " + really + " sure you don`t like Java programming?");
                    answer = scanner.nextLine();
                    really += " really";
                    counter--;
                }
            } while (counter > 0);
            if (counter == 0) {
                System.out.println("To bad..");
            }
        }
    }
}
