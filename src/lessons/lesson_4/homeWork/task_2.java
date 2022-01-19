//Задача 2 Пользователь вводит 2 числа. Проверить кратное ли первое 2 –у (second)

package lessons.lesson_4.homeWork;

import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        double num1= scanner.nextDouble();
        double num2= scanner.nextDouble();
        if (num1%num2==0) {
            System.out.println("Entered first number is multiply!");
        } else {
            System.out.println("Entered first number is not multiply!");
        }

    }
}
