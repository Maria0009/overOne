//Нарисовать в консоли шахматную доску (8x8) (нижняя левая клетка шахматной доски окрашена в чёрный цвет,
// следующая за ней — в белый, как и та, что над ней.
// Итак, цвет меняется каждый раз при переходе на соседнюю по стороне ячейку)
package lessons.lesson_10.homeWork;

import java.util.Scanner;
//+
public class Task_6 {
    public static void main(String[] args) {
        String[][] array = new String[8][8];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    array[i][j] = "W";
                } else {
                    array[i][j] = "B";
                }
            }
        }
        System.out.println("Chess board:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
