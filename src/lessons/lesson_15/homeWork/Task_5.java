package lessons.lesson_15.homeWork;

import java.util.Scanner;

//Сравнить строки лексикографически
public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstString = initString(scanner);
        String secondString = initString(scanner);
        if (equalsString(firstString, secondString) == 0) ;
        System.out.println("Strings is equals");
    }

    static int equalsString(String str1, String str2) {
        return str1.compareTo(str2);
    }

    static String initString(Scanner scanner) {
        return scanner.nextLine();
    }


}
