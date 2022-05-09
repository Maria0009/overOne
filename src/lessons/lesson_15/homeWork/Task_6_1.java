package lessons.lesson_15.homeWork;

import java.util.Arrays;

//Есть массив слов. Нужно отфильтровать его так, чтобы в выходном массиве оказались слова, которые начинаются с буквы “W”/”w”.
// Было: {"width", "ellipse", "Wrong", "hyperbola», стало: [width, Wrong]
public class Task_6_1 {
    /*It is enough to use only 1 method in this task. You are doing double work here
    It's ok to combine this logic (findLengthNewString, filterArray)
    Because they are almost the same
    */
    public static void main(String[] args) {
        String[] string = new String[]{"width", "ellipse", "Wrong", "hyperbola"};
        System.out.println(Arrays.toString(string));
        String[] newString=findLengthNewString(string);
        System.out.println(Arrays.toString(newString));
    }

    static String[] findLengthNewString(String[] string) {
        int length = 0;
        for (String s : string) {
            if (s.startsWith("W") || s.startsWith("w")) {
                length++;
            }
        }
        String[] newString = new String[length];
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
