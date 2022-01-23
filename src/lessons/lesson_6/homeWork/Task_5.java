//Решить квадратное уравнение ax^2 +bx + c = 0 через if-else
package lessons.lesson_6.homeWork;

import java.util.Scanner;
//+
public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input parameters a, b, c: ");
        double firstNumberA = scanner.nextInt();
        double secondNumberB = scanner.nextInt();
        double thirdNumberC = scanner.nextInt();
        double discriminant = Math.pow(secondNumberB, 2) - 4 * firstNumberA * thirdNumberC;
        double result1;
        double result2;
        if (discriminant > 0) {
            result1 = (-secondNumberB + Math.pow(discriminant, 0.5)) / (2 * firstNumberA);
            result2 = (-secondNumberB - Math.pow(discriminant, 0.5)) / (2 * firstNumberA);
            System.out.println(result1);
            System.out.println(result2);
        } else if (discriminant == 0) {
            result1 = (-secondNumberB) / (2 * firstNumberA);
            System.out.println(result1);
        } else {
            System.out.println("No roots!");
        }
    }
}
