//Необходимо написать программу, которая требует у пользователя ввести 2 целых числа
//строку и одно дробное число. Далее вывести на экран строку и сумму 2х целых и дробного числа
//Рассмотрен метод hasNextInt() с просьбой вводить число пока оно не будет равно int
package lessons.lesson_4.classWork;

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два целых числа:");
        int Nam1;
        int Nam2;
        while (!scanner.hasNextInt()) {
            System.out.println("That not a number!");
            scanner.next(); // this is important!
        }
        Nam1 = scanner.nextInt();
        while (!scanner.hasNextInt()) {
            System.out.println("That not a number!");
            scanner.next(); // this is important!
        }
        Nam2 = scanner.nextInt();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str;
        while (!scan.hasNextLine()) {
            System.out.println("That not a string!");
            scan.next();
        }
        str = scan.nextLine();
//        String str= new Scanner(System.in).nextLine();
        double Nam3;
        System.out.println("Введите дробное число:");
        while (!scanner.hasNextDouble()) {
            System.out.println("That not a string!");
            scanner.nextDouble();
        }
        Nam3= scanner.nextDouble();
        double sum = Nam1 + Nam2 + Nam3;
        System.out.println("str = " + str);
        System.out.println("Sum = " + sum);

    }
}
