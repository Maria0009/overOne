package lessons.lesson_23.classWork.point_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//создать класс person и проинициализировать в нем поля возраст и имя.
// Далее создать не менее 3 объектов класа и храним в маp в качетсве ключа - имя, в качестве значения - возраст.
// Ввести два числа: веррхнюю и нижнюю границу возрастов. Вывести все имена попадающие в этот интервал
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Vasya", 23);
        Person person2 = new Person("Ivan", 45);
        Person person3 = new Person("Max", 15);
        Person person4 = new Person("Sveta", 17);
        Person person5 = new Person("Olga", 40);
        Map<String, Integer> persons = new HashMap<>();
        persons.put(person1.getName(), person1.getAge());
        persons.put(person2.getName(), person2.getAge());
        persons.put(person3.getName(), person3.getAge());
        persons.put(person4.getName(), person4.getAge());
        persons.put(person5.getName(), person5.getAge());
        System.out.println(persons);
        System.out.println("Enter min:");
        int min = findRange();
        System.out.println("Enter max:");
        int max = findRange();
        for (Map.Entry<String, Integer> entry : persons.entrySet()) {
            if (entry.getValue() >= min && entry.getValue() <= max) {
                System.out.println(entry.getKey());
            }
        }
    }

    public static int findRange() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


}
