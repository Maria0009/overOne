//Задача 5 Пользователь вводит месяц в виде числа от 1 до 12 Определите в какую пору года попадает этот месяц (зима, лето, весна, осень).
package lessons.lesson_4.homeWork;

import java.util.Scanner;

public class task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number month:");
        int numb= scanner.nextInt();
        String timeOfTheYear;
        switch (numb){
            case 1: case 2:case 12:
                timeOfTheYear="Winter";
                break;
            case 3:case 4:case 5:
                timeOfTheYear="Spring";
                break;
            case 6:case 7:case 8:
                timeOfTheYear="Summer";
                break;
            case 9:case 10:case 11:
                timeOfTheYear="Autumn";
                break;
            default:
                timeOfTheYear="This month not found";
                break;
        }
        System.out.println(timeOfTheYear);

    }
}
