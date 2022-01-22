//Одиночная амеба каждые три часа делится на 2 клетки. Определить, сколько амеб будет
//через 3,6,9...24 часа.
package lessons.lesson_5.homeWork;

public class task_1 {
    public static void main(String[] args) {
        int amoeba = 1;
        for (int i = 3; i < 25; i += 3) {
            amoeba *= 2;
            System.out.println(i + " hours - " + amoeba + " amoeba");
        }
    }
}
