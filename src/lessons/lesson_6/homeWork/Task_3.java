//Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99
package lessons.lesson_6.homeWork;
//+
public class Task_3 {
    public static void main(String[] args) {
        final int LIMIT = 100;
        int i = 1;
        int sum = 0;
        while (i < LIMIT) {
            if (i % 2 != 0) {
                sum += i;
//                System.out.println(i + " - " + sum);
            }
            i++;
        }
        System.out.println("Summa: " + sum);
    }
}
