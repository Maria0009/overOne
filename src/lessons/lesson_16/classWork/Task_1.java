package lessons.lesson_16.classWork;

import java.util.Arrays;
import java.util.Scanner;

//Реализовать следующую программу:
//	Пользователю предоставляется возможность на выбор заполнить целочисленный массив или массив слов
//Если выбран массив чисел, то есть 2 варианта заполнения:
//а) самостоятельно, б) рандомными числами
//Выполнить над массивом следующие действия:
//•	Поиск максимального (минимального (можете 2 реализовать если успеете)) элемента
//•	Вернуть первый индекс введенного им элемента, иначе -1
//•	Сортировка
//Если был выбран массив слов, то
//•	Отсортировать массив слов по алфавиту (лексикографически)
//•	Пользователю предоставляется возможность ввести букву. Вместо этой буквы теперь будет рандомное число (String.valueOf(randomNumber))
public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstRequest = 0;
        do {
            int length;
            System.out.println("Choose array to work with:\n" +
                    "1: number\n" +
                    "2: string");
            int choice = initNumber(scanner);
            if (choice == 1) {
                System.out.println("How do you want to initialize array?\n" +
                        "1: from console\n" +
                        "2: random numbers");
                int initArray = initNumber(scanner);
                System.out.println("Enter length");
                length = initLength(scanner);
                int[] array = new int[length];
                System.out.println("Enter array:");
                //if you init something, then return it from method. It's a good practice. Your solution can lead to unpredictable results.
                if (initArray == 1) {
                    initArrayFromConsole(scanner, array);
                } else if (initArray == 2) {
                    inputArrayFromRandom(array);
                } else {
                    System.out.println("You entered incorrect data!");
                    break;
                }
                System.out.println("Origin array:");
                outputArray(array);
                int max = findMaxElement(array);
                System.out.println("Max: " + max);
                int min = findMinElement(array);
                System.out.println("Min: " + min);
                System.out.println("Enter number whose index you want to find:");
                int initNumber = initNumber(scanner);
                findElement(array, initNumber);
                sortArray(array);
            } else if (choice == 2) {
                System.out.println("Enter length");
                length = initLength(scanner);
                String[] array = new String[length];
                System.out.println("Enter array words:");
                array = initString(scanner, array);
                System.out.println("Origin array: " + Arrays.toString(array));
                array = sortStringArray(array);
                System.out.println("Sorted array: " + Arrays.toString(array));
                String[] newArray = replaceLetter(scanner, array);
                System.out.println(Arrays.toString(newArray));
            } else {
                System.out.println("You entered incorrect data!");
                System.out.println();
                firstRequest--;
            }
            firstRequest++;
        } while (firstRequest < 2);
    }

    private static int initNumber(Scanner scanner) {
        return scanner.nextInt();
    }


    static int initLength(Scanner scanner) {
        int length;
        do {
            length = scanner.nextInt();
            if (length <= 0) {
                System.out.println("Try again:");
            }
        }
        while (length <= 0);
        return length;
    }

    static int[] initArrayFromConsole(Scanner scanner, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    static int[] inputArrayFromRandom(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100 - 50);
        }
        return array;
    }

    static void outputArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    static int findMaxElement(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    static int findMinElement(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
//return the element, not print. Printing should be after returning
    static void findElement(int[] array, int number) {
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                System.out.println("Index: " + i);
                k++;
                break;
            }
        }
        if (k == 0) {
            System.out.println("Index: -1");
        }
    }

    static void sortArray(int[] array) {
        int temp;
        int k = 0;
        while (k < array.length) {
            for (int i = 0; i < array.length - 1 - k; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            }
            k++;
        }
        //it should be in another method
        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    static String[] initString(Scanner scanner, String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.next();
        }
        return array;
    }

    static String[] sortStringArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array);
        }
        return array;
    }

    static String[] replaceLetter(Scanner scanner, String[] array) {
        String letter = initLetter(scanner);
        String[] newArray = new String[array.length];
        int randomNumber = findRandomNumber();
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i].replace(letter, String.valueOf(randomNumber));
        }
        return newArray;
    }

    static String initLetter(Scanner scanner) {
        System.out.println("Enter letter you want to replace: ");
        return scanner.next();
    }

    static int findRandomNumber() {
        return (int) (Math.random() * 10000 - 5000);
    }
}
