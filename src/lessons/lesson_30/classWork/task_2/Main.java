package lessons.lesson_30.classWork.task_2;

import java.util.Arrays;

//Найти количество локальных максимумов и минимумов последовательности
public class Main {
    public static void main(String[] args) {
        int[] array= new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101);
        }
        System.out.println(Arrays.toString(array));
        Maximum maximum= new Maximum(array);
        Minimum minimum= new Minimum(array);
        maximum.start();
        minimum.start();
//        String str = "qwerty1 qwerty2";
//        String[] arr = new String[2];
//
//        String regex = "\\[0-9]";
//        arr = str.replace()
//        System.out.println(Arrays.toString(arr));

    }
}
