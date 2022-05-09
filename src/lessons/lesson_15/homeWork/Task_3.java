package lessons.lesson_15.homeWork;

import java.util.Arrays;
import java.util.Scanner;

//Есть массив строк, вывести на экран все строки, длина которых больше N символов
public class Task_3 {
    public static void main(String[] args) {
        String text = "Olya\n" +
                "Olya has a pen\n" +
                "She draws with a pencil\n" +
                "She writes with a pen.";
        String[] arrayLines = divisionString(text);
        System.out.println(Arrays.toString(arrayLines));
        Scanner scanner = new Scanner(System.in);
        int length = initLength(scanner);
        inputLines(arrayLines, length);
    }

    static String[] divisionString(String massLines) {
        String[] words = massLines.split("\n");
        return words;
    }

    public static int initLength(Scanner scan) {
        System.out.print("Enter length: ");
        return scan.nextInt();
    }

    static void inputLines(String[] arrayLines, int length) {
        for (int i = 0; i < arrayLines.length; i++) {
            if (arrayLines[i].length() > length) {
                System.out.println(arrayLines[i]);
            }
        }
    }
}
