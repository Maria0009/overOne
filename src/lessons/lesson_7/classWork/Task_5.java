//Напечатать таблицу умножения до 9 в треугольной форме :
package lessons.lesson_7.classWork;

public class Task_5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                int result = i * j;
                System.out.print(result + " ");
            }
            System.out.println();
        }
    }
}
