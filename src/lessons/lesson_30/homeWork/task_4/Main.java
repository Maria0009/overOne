package lessons.lesson_30.homeWork.task_4;

import java.util.Arrays;

//Запустить два потока. Первый ищет количество положительных элементов. Второй количество отрицательных
public class Main {
    public static void main(String[] args) {
        int[] array= new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101-50);
        }
        System.out.println(Arrays.toString(array));
        PositiveElement positiveElement= new PositiveElement(array);
        NegativeElement negativeElement= new NegativeElement(array);
        positiveElement.start();
        negativeElement.start();
    }
}
