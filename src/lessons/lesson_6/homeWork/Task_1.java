//Вычислить: 1+2+4+8+...+256
package lessons.lesson_6.homeWork;

public class Task_1 {
    public static void main(String[] args) {
        final int LIMIT = 256;
        int sum = 0;
        int i = 1;
        while (i <= LIMIT) {
            sum += i;
            //System.out.println(i+" "+sum);
            i *= 2;
        }
        System.out.println("Summa: " + sum);
    }
}
