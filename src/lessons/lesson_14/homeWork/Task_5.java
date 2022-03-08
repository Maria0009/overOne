package lessons.lesson_14.homeWork;

import java.util.Scanner;
import java.util.regex.Pattern;

//Пользователя просят ввести пароль. Необходимо сделать валидацию: 1)Как минимум 6 символов 2)Только буквы и цифры
//3) Как минимум 2 цифры
public class Task_5 {
    public static void main(String[] args) {
        System.out.println("Enter password: ");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.next();
        boolean found = Pattern.matches("(?=.*[a-zA-z0-9])(?=.*[0-9]{2,})[0-9a-zA-Z]{6,}", password);
        if (found) {
            System.out.println("Good password");
        } else {
            System.out.println("Bad password");
        }
    }
}
