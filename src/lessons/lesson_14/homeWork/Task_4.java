package lessons.lesson_14.homeWork;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Написать программу, которая проверяет, содержит ли строка только специальные символы(например @#$%&!~)
public class Task_4 {
    public static void main(String[] args) {
        String text = "!@#$~$#";
        Pattern pattern = Pattern.compile("[!@#$%^&*~]*");
        Matcher matcher = pattern.matcher(text);
        System.out.println(matcher.matches());
    }
}
