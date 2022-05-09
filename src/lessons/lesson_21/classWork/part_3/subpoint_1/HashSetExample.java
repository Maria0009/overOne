package lessons.lesson_21.classWork.part_3.subpoint_1;

import lessons.lesson_21.classWork.part_3.subpoint_2.Student;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Integer> integers = new HashSet<>();
        integers.add(1);
        integers.add(3);
        integers.add(2);
        integers.add(55);
        integers.add(-1111);
        integers.add(20);
        integers.add(20);
        integers.add(2);
        System.out.println(integers);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);
        integerList.add(2);
        System.out.println(integerList);

        Set<Integer> unique = new HashSet<>();
        unique.addAll(integerList);
        System.out.println(unique);

        Set<Student> students = new HashSet<>();
        students.add(new Student("Alex", 22));
        students.add(new Student("Alex", 20));
        students.add(new Student("Egorka", 23));
        students.add(new Student("Egorka", 23));

        System.out.println(students);
    }
}
