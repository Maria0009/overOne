//Составить программу вычисляющую А*В, не пользуясь операцией умножения
package lessons.lesson_5.homeWork;

import java.util.Scanner;
//+'
public class task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 number:");
        //naming, please
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double multiplication = 0;
        for (int i = 0; i < B; i++) {
            multiplication += A;
        }
        System.out.println(A + " * " + B + " = " + multiplication);
    }
}
