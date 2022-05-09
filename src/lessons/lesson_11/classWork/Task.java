package lessons.lesson_11.classWork;

import java.util.Arrays;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = scanner.nextInt();
        int[][] array = new int[size][size];
        int evenNumber = 0;
        int oddNumber = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
                if (array[i][j] % 2 == 0) {
                    evenNumber++;
                } else {
                    oddNumber++;
                }
            }
        }
        int[] evanArray = new int[evenNumber];
        int[] oddArray = new int[oddNumber];
        int k = 0;
        int m = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0) {
                    evanArray[k] = array[i][j];
                    k++;
                } else {
                    oddArray[m] = array[i][j];
                    m++;
                }
            }
        }
        System.out.println(Arrays.deepToString(array));
        System.out.println(Arrays.toString(evanArray));
        System.out.println(Arrays.toString(oddArray));
    }
}
