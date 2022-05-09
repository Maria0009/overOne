package lessons.lesson_21.classWork.part_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(44);
        strings.add("A");

        List<String> ll = new LinkedList<>();
        ll.add("CC");
        ll.addAll(strings);
//        ll.remove("CC");
//        ll.remove(1);
        System.out.println("Before removing: " + ll);
        ll.removeAll(strings);
        System.out.println("After: " + ll);

//        List<String> a = Collections.singletonList("A");
//        a.add("2");
    }
}
