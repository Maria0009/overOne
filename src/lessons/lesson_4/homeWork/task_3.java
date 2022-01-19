//Задача 3 Пользователь вводит число. Отображаем название дня недели, иначе, что такого дня нет.
package lessons.lesson_4.homeWork;

import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number day of the week:");
        int number= scanner.nextInt();
        String dayWeek1;
        if (number==1){
            dayWeek1="Monday";
        }
        else if(number==2) {
            dayWeek1 = "Tuesday";
        }
        else if(number==3) {
            dayWeek1 = "Wednesday";
        }
        else if(number==4) {
            dayWeek1 = "Thursday";
        }
        else if(number==5) {
            dayWeek1 = "Friday";
        }
        else if(number==6) {
            dayWeek1 = "Saturday";
        }
        else if(number==7) {
            dayWeek1 = "Sunday";
        }
        else{
            dayWeek1="This day not found";
        }
        System.out.println(dayWeek1);

    }
}
