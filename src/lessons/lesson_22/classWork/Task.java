package lessons.lesson_22.classWork;

import java.util.HashMap;
import java.util.Map;

public class Task {
    public static void main(String[] args) {
//keySet() — возвращает множество(Set) ключей;
//values() — возвращает коллекцию(Collection) значений;
//entrySet() — возвращает множество(Set) наборов “ключ-значение”.
        //бинарные деревья- разобрать
//Перебор
//1     //for(Map.Entry<Integer, String> entry: map.entrySet()) {
        //   // get key
        //   Integer key = entry.getKey();
        //   // get value
        //   String value = entry.getValue();
        //}
//2     //fori()
        // map.get(i)
//3
        Map<Integer, String> map = new HashMap<>();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
        }
//Методы для получения всех значений
        //keySet
//Empty Map create:
//Map<Integer, String> emptyMap = new HashMap<>();
//Map<Integer, String> emptyMap =  Collections.emptyMap();
    }
}
