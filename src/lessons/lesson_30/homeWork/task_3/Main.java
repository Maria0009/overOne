package lessons.lesson_30.homeWork.task_3;

import java.util.Arrays;

//создать массив и выводить в первом потоке четные элементы,
//во втором нечетные(по индексу). Интервал полсекунды
public class Main {
    public static void main(String[] args) {
        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101);
        }
        System.out.println(Arrays.toString(array));
        First first = new First(array);
        Second second = new Second(array);
        first.start();
        second.start();

    }
}
