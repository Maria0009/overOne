package lessons.lesson_15.homeWork;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Есть текст, пользователь вводит несколько слов. Надо проверить, есть ли они в тексте и в каком количестве
public class Task_7 {
    public static void main(String[] args) {
        String text = "The most thing, the thing, the ";
        Scanner scanner = new Scanner(System.in);
        String words = initWord(scanner);
        String[] wordsArray = words.split(" ");
        for (int i = 0; i < wordsArray.length; i++) {
            System.out.println(wordsArray[i] + " is in text " + countWord(text, wordsArray[i]));
        }
    }

    static String initWord(Scanner scanner) {
        return scanner.nextLine();
    }

    static int countWord(String text, String word) {
        int counter = 0;
        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            counter++;
        }
        return counter;
    }


}
