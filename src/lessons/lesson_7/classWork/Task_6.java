//Написать программу, которая проверяет, является ли число кубом (8=2^3)
package lessons.lesson_7.classWork;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int enter = scanner.nextInt();
        int n = (int) Math.cbrt(enter);
        if (enter == n * n * n) {
            System.out.println("Enter number is cube");
        } else {
            System.out.println("Enter number is not cube");
        }
    }
}
