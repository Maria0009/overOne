package lessons.lesson_23.classWork.point_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MainString {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("bfde");
        list.add("bfde");
        list.add("gd");
        list.add("asdafs");
        list.add("a");
        list.add("bfde");
        list.add("gd");
        list.add("asdafs");
        list.add("a");
        list.add("a");
        System.out.println(list);
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).equals(list.get(i))) {
                    list.remove(j);
                    j--;
                }
            }
        }
        System.out.println(list);
    }
}
