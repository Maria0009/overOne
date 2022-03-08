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
//I'm not sure it works as expected. I enter first letter 'u' (it's not the last), then - i, then - b.
//And according to your solution it will look like this - 'Fbll your fble wbth words'.
//But I expect nothing to be changed
// you can look at this solution - https://github.com/satan-tango/javacourse/blob/master/src/com/javacourse/lessons/les_10/homework/task_3/Task_3.java
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
