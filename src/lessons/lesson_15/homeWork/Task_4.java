package lessons.lesson_15.homeWork;

import java.time.LocalDateTime;
import java.util.Date;

//Задание на изучение нового материала:  вывести текущую дату, день недели и время. Подсказка кроется в Java 8 :)
public class Task_4 {
    public static void main(String[] args) {
        LocalDateTime dateTime= LocalDateTime.now();
        System.out.println(dateTime);
    }
}
