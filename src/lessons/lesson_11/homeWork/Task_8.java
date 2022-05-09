//Найти дупликаты в массиве char
package lessons.lesson_11.homeWork;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length array:");
        int size = scanner.nextInt();
        System.out.println("Enter array:");
        char[] charArray = new char[size];
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = scanner.next().charAt(0);
        }
        int counter = 0;
        for (int i = 0; i < charArray.length - 1; i++) {
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] == (charArray[j])) {
                    System.out.println(charArray[i]);
                    counter++;
                }
            }
        }
        if (counter == 0) {
            System.out.println("Not duplicate");
        }

    }
}
