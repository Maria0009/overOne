package lessons.lesson_21.classWork.part_1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("A");
        strings.add("B");
        strings.add("C");
        strings.add(0, "K");
        System.out.println(strings);
        strings.set(0, "D");
        System.out.println(strings);
    }
}
