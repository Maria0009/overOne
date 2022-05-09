package lessons.lesson_23.classWork.point_3;

import java.util.ArrayList;
import java.util.List;

//Есть набор чисел отсортировать как Set( без повторений)
//Сделать из лист сэт(удалит все повторяющиеся значения)
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) == list.get(i)) {
                    list.remove(j);
                    j--;
                }
            }
        }
        System.out.println(list);
    }
}
