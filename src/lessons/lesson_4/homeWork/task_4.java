//Задачи на switch – case:
//Задача 4 Пользователь вводит число. Отображаем название дня недели, иначе, что такого дня нет (т.е переписать 2.3 с другой конструкцией)
package lessons.lesson_4.homeWork;

import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number day of the week:");
        int num= scanner.nextInt();
        String dayWeek;
        switch (num) {
            case 1:
                dayWeek="Monday";
                break;
            case 2:
                dayWeek="Tuesday";
                break;
            case 3:
                dayWeek="Wednesday";
                break;
            case 4:
                dayWeek="Thursday";
                break;
            case 5:
                dayWeek="Friday";
                break;
            case 6:
                dayWeek="Saturday";
                break;
            case 7:
                dayWeek="Sunday";
                break;
            default:
                dayWeek="This day not found";
                break;
        }
        System.out.println(dayWeek);

    }
}
