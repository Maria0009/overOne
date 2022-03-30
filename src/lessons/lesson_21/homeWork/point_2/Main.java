package lessons.lesson_21.homeWork.point_2;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

//Есть TreeSet чисел, нужно отсортировать его в обратном порядке
public class Main {
    public static void main(String[] args) {
        Set<Integer> integers = new TreeSet<>();
        integers.add(5);
        integers.add(3);
        integers.add(4);
        integers.add(32);
        integers.add(21);
        integers.add(22);
        integers.add(37);
        integers.add(2);
        integers.add(422);
        integers.add(44);
        System.out.println(integers);
        Set<Integer> integersRevers = new TreeSet<>(Comparator.reverseOrder());
        integersRevers.addAll(integers);
        System.out.println(integersRevers);
    }
}
