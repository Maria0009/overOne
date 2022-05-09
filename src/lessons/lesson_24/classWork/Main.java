package lessons.lesson_24.classWork;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("aaaa");
        strings.add("bbbb");
        strings.add("cccc");
        strings.add("aaaa");
        strings.add("bbbb");
        strings.add("cccc");
        System.out.println(strings);
        for (int i = 0; i < strings.size(); i++) {
            for (int j = i + 1; j < strings.size(); j++) {
                if (strings.get(i).equals(strings.get(j))) {
                    strings.remove(j);
                }
            }
        }
        System.out.println(strings);
    }
}
