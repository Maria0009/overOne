package lessons.lesson_13.homeWork;

import java.util.Scanner;

//method names should be verbs, not nouns
//вывести числа которые являются положительными и кратными числу, которое ввел пользователь. Вывести количество совпадений
public class Task_2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size array");
        int size = initSize(scanner);
        System.out.println("Enter array:");
        int[] array = new int[size];
        initArray(scanner, array);
        System.out.println("Enter number:");
        int number = number(scanner);
        int count = countHit(number, array);
        System.out.println();
        System.out.println("Number of coincidences " + count);
    }

    //initSize
    static int initSize(Scanner scanner) {
        return scanner.nextInt();
    }

    //initArray
    static int[] initArray(Scanner scanner, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    static int number(Scanner scanner) {
        return scanner.nextInt();
    }

    //method name should demonstrate what it does
    static int countHit(int number, int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] % number == 0) {
                counter++;
                System.out.print(array[i] + " ");
            }
        }
        return counter;
    }

}
