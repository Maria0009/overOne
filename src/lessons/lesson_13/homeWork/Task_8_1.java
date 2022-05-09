package lessons.lesson_13.homeWork;

import java.util.Scanner;

//Найти дупликаты в массиве char
public class Task_8_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length array:");
        int size = size(scanner);
        System.out.println("Enter array:");
        char[] array = initArray(scanner, size);
        int counter = findDuplicate(array);
        if (counter == 0) {
            System.out.println("Not duplicate");
        }
    }

    static int size(Scanner scanner) {
        return scanner.nextInt();
    }

    static char[] initArray(Scanner scanner, int size) {
        char[] charArray = new char[size];
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = scanner.next().charAt(0);
        }
        return charArray;
    }

    //findDuplicate
    static int findDuplicate(char[] charArray) {
        int counter = 0;
        for (int i = 0; i < charArray.length - 1; i++) {
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] == (charArray[j])) {
                    System.out.println(charArray[i]);
                    counter++;
                }
            }
        }
        return counter;
    }
}

