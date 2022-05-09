package lessons.lesson_30.homeWork.task_1;

import java.util.ArrayList;
import java.util.List;

//создать два потока. Первый ищет второй по величине элемент коллекции,
// второй ищет второй по меньшинству элемент коллекции
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int number = (int) (Math.random() * 101+1);
            list.add(number);
        }
        System.out.println(list);
        First first = new First(list);
        Second second = new Second(list);
        first.start();
        second.start();
//        list.sort(Comparator.naturalOrder());
//        System.out.println(list);
    }
}
