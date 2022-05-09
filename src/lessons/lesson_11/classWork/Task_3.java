package lessons.lesson_11.classWork;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task_3 {
    public static void main(String[] args) {
//Сортировка пузырек
 /*       int[] array={-1,8,3,-10,4};
        int temp;
        int k=0;
        while(k< array.length){
        for (int i = 0; i < array.length-1-k; i++) {
            if (array[i] > array[i + 1]) {
                temp = array[i + 1];
                array[i + 1] = array[i];
                array[i] = temp;
            }
        }
        k++;
        }
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);

//foreach
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        //==
        for(int temp1 :array){
            System.out.println(temp1);
        }
        */
        int[][] array2={{-1,8,3},{-10,4}};
        for (int[] arrayTemp:array2) {
            for (int temp3:arrayTemp) {
                System.out.print(temp3+"\t");
            }
            System.out.println();
        }
//        int min =array[0];
//        int max=array[0];
//        for (int i = 0; i < array.length; i++) {
//            if(min>array[i]){
//                min=array[i];
//            }
//            if(max<array[i]){
//                max=array[i];
//            }
//        }
//        System.out.println(min);
//        System.out.println(max);
    }
}
