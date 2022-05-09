package lessons.lesson_16.classWork;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chosenIndex = chooseArray(scanner);
        final int arrayNumIndex = 1;
        final int arrayStrIndex = 2;
        if (chosenIndex == arrayNumIndex) {
            int[] arrayNum = initNumArray(scanner);
            System.out.println("Origin array: " + Arrays.toString(arrayNum));
            int max = findMax(arrayNum);
            System.out.println("Max: " + max);
            int min = findMin(arrayNum);
            System.out.println("Min: " + min);
            int index = findIndex(arrayNum, scanner);
            System.out.println("Index: " + index);
            Arrays.sort(arrayNum);
            System.out.println("Sorted array: " + Arrays.toString(arrayNum));
        } else if (chosenIndex == arrayStrIndex) {
            String[] arrayStr = initStrArray(scanner);
            System.out.println("Origin array: " + Arrays.toString(arrayStr));
            Arrays.sort(arrayStr);
            System.out.println("Sorted array: " + Arrays.toString(arrayStr));
            replaceLetterWithRandomNumber(arrayStr, scanner);
            System.out.println("Replaced with random number array: " + Arrays.toString(arrayStr));
        }
    }

    static int chooseArray(Scanner scanner) {
        System.out.println("Choose array to work with: ");
        System.out.println("1: numbers");
        System.out.println("2: strings");
        return scanner.nextInt();
    }

    static int[] initNumArray(Scanner scanner) {
        System.out.println("How do you want to initialize array?");
        System.out.println("1: from console");
        System.out.println("2: random numbers");
        final int consoleIndex = 1;
        int index = scanner.nextInt();
        if (index == consoleIndex) {
            return initNumArrayConsole(scanner);
        } else {
            return initNumArrayRandom(scanner);
        }
    }

    static String[] initStrArray(Scanner scanner) {
        int length = getLength(scanner);
        String[] array = new String[length];
        System.out.println("Enter words: ");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.next();
        }
        return array;
    }

    static int[] initNumArrayConsole(Scanner scanner) {
        System.out.println("Initializing array...");
        int length = getLength(scanner);
        int[] array = new int[length];
        System.out.println("Enter numbers: ");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int getLength(Scanner scanner) {
        System.out.println("Enter length: ");
        boolean isValidLength = false;
        int length = 0;
        while (!isValidLength) {
            length = scanner.nextInt();
            if (length > 0) {
                isValidLength = true;
            } else {
                System.out.println("Try again: ");
            }
        }
        return length;
    }

    static int[] initNumArrayRandom(Scanner scanner) {
        int length = getLength(scanner);
        Random random = new Random();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }

    static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {

            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    static int findIndex(int[] arrayNum, Scanner scanner) {
        System.out.println("Enter number whose index you want to find: ");
        int userNumber = scanner.nextInt();
        for (int i = 0; i < arrayNum.length; i++) {
            if (arrayNum[i] == userNumber) {
                return i;
            }
        }
        return -1;
    }

    static void replaceLetterWithRandomNumber(String[] arrayStr, Scanner scanner) {
        System.out.println("Enter letter you want to replace: ");
        String letter = getLetter(scanner);
        for (int i = 0; i < arrayStr.length; i++) {
            arrayStr[i] = arrayStr[i].replace(letter, String.valueOf(new Random().nextInt()));
        }
    }

    static String getLetter(Scanner scanner) {
        String letter = "";
        boolean isLetter = false;
        while (!isLetter) {
            letter = scanner.next();
            if (letter.length() == 1) {
                isLetter = true;
            } else {
                System.out.println("Try again: ");
            }
        }
        return letter;
    }
}
