package lessons.lesson_22.classWork.point_1;

import java.util.HashMap;
import java.util.Map;

//
public class Task {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 1, j = 9; i < 10; i++) {
            map.put(i, String.valueOf(j));
        }
        System.out.println(map);
    }
}
