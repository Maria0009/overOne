package lessons.lesson_27.classWork.point_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        System.out.println("Enter login: ");
        String login = enter();
        System.out.println("Enter password: ");
        String password = enter();
        user.registration(login, password);
    }

    public static String enter() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
