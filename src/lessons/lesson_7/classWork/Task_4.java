//Вводим число. Программа генерирует рандомное число. Определяем равно (больше, меньше) ли введенное число сгенерированному
package lessons.lesson_7.classWork;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int random = (int) (Math.random() * 1000 - 500);
        System.out.println(random);
        if (number > random) {
            System.out.println("Enter number > random");
        } else if (number == random) {
            System.out.println("Enter number = random");
        } else {
            System.out.println("Enter number < random");
        }

    }
}
