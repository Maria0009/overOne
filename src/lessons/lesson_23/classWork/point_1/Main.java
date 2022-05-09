package lessons.lesson_23.classWork.point_1;

import java.util.ArrayList;
import java.util.List;

//Sort by length
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("bfde");
        list.add("gd");
        list.add("asdafs");
        list.add("a");

        System.out.println(list);

        String temp;
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).length() > list.get(j).length()) {
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        System.out.println(list);
    }
}