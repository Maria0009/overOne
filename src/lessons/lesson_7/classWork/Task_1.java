//Пользователь вводит число типа int. Вывести зеркальное. Т. е дано 1234, результат 4321
package lessons.lesson_7.classWork;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scanner.nextInt();
        while (number > 0) {
            int num = number % 10;
            number /= 10;
            System.out.print(num);
        }
// or

//        for (int i = 0; i < number.length(); i++){
//        char c=number.charAt(i);
    }
}
