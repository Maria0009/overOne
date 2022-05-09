package lessons.lesson_14.homeWork;

import java.util.Scanner;

//Есть предложение. Пользователь вводит букву. Определить, есть ли эта буква в предложении.
//Использовать метод класса String
public class Task_1 {
    public static void main(String[] args) {
        String text = "Hello world";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter letter");
        char letter = initLetter(scanner);
        int index = text.indexOf(letter);
        if (index == -1) {
            System.out.println("Not found!");
        } else {
            System.out.println("The letter is in the text!");
        }
    }

    static char initLetter(Scanner scanner) {
        return scanner.next().charAt(0);
    }
}
