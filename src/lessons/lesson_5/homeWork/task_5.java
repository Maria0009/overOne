//Нарисовать 2 оставшиеся треугольника с помощью *
package lessons.lesson_5.homeWork;

public class task_5 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(" * ");
            }
            System.out.println();
        }



    }
}
