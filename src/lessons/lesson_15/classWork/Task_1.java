package lessons.lesson_15.classWork;

import java.util.Arrays;
import java.util.Scanner;

//Посчитать количество слов в тексте
public class Task_1 {
    public static void main(String[] args) {
        //String[] str="Hello world. Today is a good day!".split(" ");
        Scanner scanner = new Scanner(System.in);
        String[] str = initString(scanner).split(" ");
        System.out.println(Arrays.toString(str));
        int counterWord = str.length;
        System.out.println(counterWord);
    }

    static String initString(Scanner scanner) {
        return scanner.nextLine();
    }




}
