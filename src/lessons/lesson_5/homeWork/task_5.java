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
        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0:
                    System.out.print("         ");
                    break;
                case 1:
                    System.out.print("      ");
                    break;
                case 2:
                    System.out.print("   ");
                    break;
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            for (int j = 3; j >= i; j--) {
                System.out.print(" * ");
            }
            System.out.println();
            switch (i) {
                case 0:
                    System.out.print("   ");
                    break;
                case 1:
                    System.out.print("      ");
                    break;
                case 2:
                    System.out.print("         ");
                    break;
            }
        }

//rhombus
        System.out.println();
        for (int i = 1; i < 8; i += 2) {
            switch (i) {
                case 1:
                    System.out.print("         ");
                    break;
                case 3:
                    System.out.print("      ");
                    break;
                case 5:
                    System.out.print("   ");
                    break;
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (int i = 0; i < 8; i += 2) {
            for (int j = 7; j >= i; j--) {
                System.out.print(" * ");
            }
            System.out.println();
            switch (i) {
                case 0:
                    System.out.print("   ");
                    break;
                case 2:
                    System.out.print("      ");
                    break;
                case 4:
                    System.out.print("         ");
                    break;
            }
        }
        System.out.println();


    }
}
