package lessons.lesson_22.classWork.point_3;

import java.util.HashMap;
import java.util.Map;

//Написать программу записи в мап всех четных чисел из промежутка от 0 до 100
//И найти сумму всех значений
public class Main {
    public static void main(String[] args) {

        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 1, j = 0; j <= 100; i++, j += 2) {
            map.put(i, j);
            sum += j;
        }
        System.out.println(map);
        System.out.println("Sum:" + sum);
    }
}
