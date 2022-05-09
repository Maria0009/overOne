package lessons.lesson_29.classWork.point_6;

import java.util.Arrays;
import java.util.Locale;

//Написть два потока. Одни - ищет самую длиную строку в массиве.
//Второй - ищет строку, которая начинается с буквы, которая ближе всех к началу алфавита
public class Second extends Thread {

    private String[] strings;
    private char letter = 'z';
    private String newString = " ";

    public Second(String... strings) {
        this.strings = strings;
    }

    public void run() {
        char[] ch;
        for (int i = 0; i < strings.length; i++) {
            ch = strings[i].toLowerCase(Locale.ROOT).toCharArray();
            if (ch[0] < letter) {
                letter = ch[0];
                newString = strings[i];
            }
        }
        System.out.println(newString);
    }

}
