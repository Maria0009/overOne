package lessons.lesson_9.classWork;

import java.util.Arrays;

public class Task_1 {
    public static void main(String[] args) {
//        int[] array = new int[10];
//        array[0]=100;
//        System.out.println(array[0]);
//        //System.out.println(Arrays.toString(array));
//or
//        int[] array={10,20,30};//int[] array=new int[]{10,20,30};
//        String[] seasons=new String[4];
//        seasons[0]="Winter";
//        seasons[1]="Spring";
//        seasons[2]="Summer";
//        seasons[3]="Autumn";
//        for(int i=0;i< seasons.length;i++){
//            System.out.println(seasons[i]);
//        }
//Task_1 Создать массив из 3 элементов. Вывести сумму.
        int[] array = new int[3];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum: " + sum);

    }
}
