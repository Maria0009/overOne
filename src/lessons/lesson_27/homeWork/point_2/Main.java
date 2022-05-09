package lessons.lesson_27.homeWork.point_2;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DataBase user = new DataBase();
        System.out.println("Enter login: ");
        String login = enter();
        System.out.println("Enter password: ");
        String password = enter();
    }

    public static String enter() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}

