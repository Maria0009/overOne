package lessons.lesson_15.homeWork;

import java.util.Arrays;
import java.util.Scanner;

//Посчитать количество слов в тексте
public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = initString(scanner).split(" \\w");
        System.out.println(Arrays.toString(str));
        int counterWord = countWord(str);
        System.out.println("Counter word is " + counterWord);
    }

    static String initString(Scanner scanner) {
        return scanner.nextLine();
    }

    static int countWord(String[] str) {
        return str.length;
    }
}
