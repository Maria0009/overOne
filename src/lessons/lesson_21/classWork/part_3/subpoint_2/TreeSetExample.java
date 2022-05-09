package lessons.lesson_21.classWork.part_3.subpoint_2;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<Integer> integers = new TreeSet<>();
        integers.add(1);
        integers.add(3);
        integers.add(2);
        System.out.println(integers);

        Set<String> strings = new TreeSet<>();
        strings.add("A");
        strings.add("C");
        strings.add("Bb");
        System.out.println(strings);
    }
}
