package lessons.lesson_15.homeWork;

import java.util.Arrays;

//Есть массив слов. Нужно отфильтровать его так, чтобы в выходном массиве оказались слова, которые начинаются с буквы “W”/”w”.
// Было: {"width", "ellipse", "Wrong", "hyperbola», стало: [width, Wrong]
public class Task_6 {
    public static void main(String[] args) {
        String[] string = new String[]{"width", "ellipse", "Wrong", "hyperbola"};
        System.out.println(Arrays.toString(string));
        String[] newString = new String[findLengthNewString(string)];
        filterArray(string, newString);
        System.out.println(Arrays.toString(newString));
    }

    static int findLengthNewString(String[] string) {
        int length = 0;
        for (String s : string) {
            if (s.startsWith("W") || s.startsWith("w")) {
                length++;
            }
        }
        return length;
    }

    static String[] filterArray(String[] string, String[] newString) {
        int k = 0;
        for (String s : string) {
            if (s.startsWith("W") || s.startsWith("w")) {
                newString[k] = s;
                k++;
            }
        }
        return newString;
    }
}
