//Определить является ли число палиндромом (читаются одинаково вперед-назад: 151, 12321)
package lessons.lesson_7.classWork;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int j = number.length() - 1;
        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            char v = number.charAt(j);
            if (c != v) {
                System.out.println("It is not polinom");
                break;
            }
            j--;
            if (i == number.length() - 1) {
                System.out.println("It is polinom");
            }
        }
//or

    }
}
