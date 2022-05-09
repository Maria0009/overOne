package lessons.lesson_15.homeWork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_1_1 {
    public static void main(String[] args) {
        String text = "This word has vowels and consonants letter";
        //you could place here letters only in lower case and write Pattern.compile(letter,Pattern.CASE_INSENSITIVE) as an option:)
        String letterVowels = "a e y u i o";
        String letterConsonants = "q w r t p s d f g h j k l z x c v b n m";
        int counterVowels = countAllLetter(text, letterVowels);
        int counterConsonants = countAllLetter(text, letterConsonants);
        System.out.println("Counter vowels is: " + counterVowels);
        System.out.println("Counter consonants is: " + counterConsonants);
    }

    static int countMatcher(String text, String letter) {
        int counter = 0;
        Pattern pattern = Pattern.compile(letter,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            counter++;
        }
        return counter;
    }

    static int countAllLetter(String text, String letter) {
        int allCounter = 0;
        String[] vowelsLetter = letter.split(" ");
        for (int i = 0; i < vowelsLetter.length; i++) {
            allCounter += countMatcher(text, vowelsLetter[i]);
        }
        return allCounter;
    }
}
