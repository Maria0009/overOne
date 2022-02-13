//Задачи по if-else:
//Задача 1 Пользователь вводит 3 числа. Найти максимальное и вывести его. Решить 2 способами:
// 1-через вложенный if, т.е if(condition){if(condition)…}…, 2 – используя логические операции
package lessons.lesson_4.homeWork;

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        double first = scanner.nextDouble();
        double second = scanner.nextDouble();
        double third = scanner.nextDouble();
/*        //First method

        if (first > second && first > third) {
            System.out.println("Max number is: " + first);
        } else if (second > first && second > third) {
            System.out.println("Max number is: " + second);
        } else if (third > first && third > second) {
            System.out.println("Max number is: " + third);
        }
        else{
            System.out.println("Max number is: " + first);
        }
        //Second method
        //Cool, +
        double maxFirstSecond = Math.max(first, second);
        double maxNumber = Math.max(maxFirstSecond, third);
        System.out.println("Max number is: " + maxNumber);
        //Third method
*/
        if (first > second) {
            if (first > third) {
                System.out.println("Max number is: " + first);
            }
        }
        if (second > first) {
            if (second > third) {
                System.out.println("Max number is: " + second);
            }
        }
        if (third > first) {
            if (third > second) {
                System.out.println("Max number is: " + third);
            }
        }


    }
}
