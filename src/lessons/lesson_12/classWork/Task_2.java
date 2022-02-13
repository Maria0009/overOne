package lessons.lesson_12.classWork;

import java.util.Arrays;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length array:");
        int size = scanner.nextInt();
        System.out.println("Entered array:");
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()* 100 - 50);
        }
        System.out.println(Arrays.toString(array));
        int max=array[0];
        int min=array[0];
        for (int i = 0; i < array.length; i++) {
            if(max<array[i]){
                max=array[i];
            }
            if(min>array[i]){
                min=array[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
        int max1=array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]==max){
                continue;
            }
            else if(max1<array[i]){
                max1=array[i];
            }
        }
        System.out.println(max1);
        int min1=array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]==min){
                continue;
            }
            else if(min1>array[i]){
                min1=array[i];
            }
        }
        System.out.println(min1);

    }
}
