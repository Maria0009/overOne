//Нарисовать бабочку
package lessons.lesson_10.homeWork;

public class Task_8 {
    public static void main(String[] args) {
        int[][] array = new int[17][18];
        for (int i = 0; i < array.length / 2; i++) {
            for (int j = 0; j < array[i].length / 2; j++) {
                if (j <= i) {
                    array[i][j] = j + 1;
                }
            }
        }
        for (int i = array.length / 2; i < array.length; i++) {
            for (int j = 0; j < array[i].length / 2; j++) {
                if (j < (array[i].length - 1 - i)) {
                    array[i][j] = j + 1;
                }
            }
        }
        for (int i = 0; i < array.length / 2; i++) {
            for (int j = array[i].length / 2; j < array[i].length; j++) {
                if (j >= (array[i].length - 1 - i)) {
                    array[i][j] = array[i].length - j;
                }
            }
        }

        for (int i = array.length / 2; i < array.length; i++) {

            for (int j = array[i].length / 2; j < array[i].length; j++) {
                if (j > i) {
                    array[i][j] = array[i].length - j;
                }
            }
        }
        System.out.println("Butterfly:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] != 0) {
                    System.out.print(array[i][j] + "\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }
}
