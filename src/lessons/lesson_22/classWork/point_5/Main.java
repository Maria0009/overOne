package lessons.lesson_22.classWork.point_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Animal> map = new HashMap<>();
        Cat cat = new Cat();
        Dog dog = new Dog();
        map.put(cat.getName(), cat);
        map.put(dog.getName(), dog);
        String name = findName();
        for (Map.Entry<String, Animal> entry : map.entrySet()) {
            if (entry.getKey().equals(name)) {
                entry.getValue().food();
                entry.getValue().makeSound();
            }
        }
    }

    public static String findName() {
        System.out.println("Enter lastName");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
