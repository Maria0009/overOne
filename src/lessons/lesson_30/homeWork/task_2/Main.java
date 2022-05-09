package lessons.lesson_30.homeWork.task_2;

import java.util.Arrays;

//создать два потока. Первый ищет второй по величине элемент arrays,
//второй ищет второй по меньшинству элемент arrays
public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10 - 5);
        }
        System.out.println(Arrays.toString(array));
        First first = new First(array);
        Second second = new Second(array);
        first.start();
        second.start();
//        Arrays.stream(array).sorted();
//        System.out.println(array);
    }
}
