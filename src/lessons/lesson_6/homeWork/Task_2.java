//Напишите программу вывода всех четных чисел от 2 до 100 включительно
package lessons.lesson_6.homeWork;

public class Task_2 {
    public static void main(String[] args) {
        final int LIMIT = 100;
        int i = 2;
        while (i <= LIMIT) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
//or
        for (int number = 2; number <= LIMIT; number++) {
            if (number % 2 != 0) {
                continue;
            }
            System.out.print(number + " ");
        }
        System.out.println();
//or
        int numb = 2;
        while (numb <= LIMIT) {
            System.out.print(numb + " ");
            numb += 2;
        }

    }
}
