package lessons.lesson_10.classWork;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter array`s length:");
//        int size = scanner.nextInt();
//        String[] array = new String[size];
//        System.out.println("Enter arrays:");
//        for (int i = 0; i < array.length; i++) {
//            array[i] = scanner.next();
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
        int[][] twoDimArray=new int[2][2];
        int[][] twoDim= {{5,7,3,17},{7,0,1,12},{8,1,2,3}};
        System.out.println(twoDim.length);// выводит количество строк т.е. 3
        System.out.println(twoDim[0].length);// выводит столбец т.е. 4

        int [][] two= {{1,2},{1,2,3}};
        for (int i = 0; i < two.length; i++) {
            for(int j=0;j<two[i].length;j++){
                System.out.print(two[i][j]+ "\t");
            }
            System.out.println();
        }
    }
}
