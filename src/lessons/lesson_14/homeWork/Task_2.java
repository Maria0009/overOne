package lessons.lesson_14.homeWork;

import java.util.Scanner;

//В каждом слове k-ю букву заменить заданным символом. Если k больше длины слова, корректировку не выполнять.
public class Task_2 {
    public static void main(String[] args) {
        String[] text = "The quick brown fox jumps over the lazy dog".split(" ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter letter to which we will be change:");
        char letter = Task_1.initLetter(scanner);
        System.out.println("Enter a position letter which we will be change:");
        int k = initPosition(scanner);
        changeLetter(text, k, letter);
    }

    static int initPosition(Scanner scanner) {
        return scanner.nextInt();
    }

    static void changeLetter(String[] text, int k, char letter) {
        for (int i = 0; i < text.length; i++) {
            if (text[i].length() >= k) {
                char simbl = text[i].charAt(k - 1);
                text[i] = text[i].replace(simbl, letter);
            }
            System.out.print(text[i] + " ");
        }
    }
}
