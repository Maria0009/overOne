package lessons.lesson_14.homeWork;

import java.util.Scanner;

//В тексте после буквы, например, P, если она не последняя в слове, ошибочно напечатана буква, например A,
// вместо, например O. Внести в текст исправления.
public class Task_3 {
    public static void main(String[] args) {
        String[] text = "Fill your file with words".split(" ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter previous letter");
        String previousLetter = scanner.next();
        System.out.println("Enter mistake letter");
        char mistakeLetter = Task_1.initLetter(scanner);
        System.out.println("Enter true letter");
        char newLetter = Task_1.initLetter(scanner);
        changeLetter(text, previousLetter, mistakeLetter, newLetter);
    }

    static void changeLetter(String[] text, String previousLetter, char mistakeLetter, char newLetter) {
        String str1 = previousLetter + mistakeLetter;
        String str2 = previousLetter + newLetter;
        for (int i = 0; i < text.length; i++) {
            boolean flag = text[i].endsWith(previousLetter);
            if (!flag) {
                text[i] = text[i].replace(str1, str2);
            }
            System.out.print(text[i] + " ");
        }
    }

}
