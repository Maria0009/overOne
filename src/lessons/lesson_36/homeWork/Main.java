package lessons.lesson_36.homeWork;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Дан список класса People (с полями name — имя, age — возраст, sex — пол)
//Отфильтровать по имени
//Найти количество иванов
//Вывести длины имен
//Вернуть первый элемент коллекции или 0, если коллекция пуста
//Вернуть последний элемент коллекции или «empty», если коллекция пуста
//Вернуть два элемента начиная со второго
//Выбрать самую молодую женщину
//Выбрать мужчин-военнообязанных (от 18 до 27 лет)
//Найти кол-во потенциально работоспособных людей в выборке (т.е. от 18 лет и учитывая что женщины выходят на пенсию в 55 лет, а мужчина в 60)
//Добавить какое-то значение к имени каждого мужчины


public class Main {
    public static void main(String[] args) {

        List<People> list = new ArrayList();

        list.add(new People("Борис", 18, "male"));
        list.add(new People("Иван", 23, "male"));
        list.add(new People("Ирина", 3, "female"));
        list.add(new People("Ирина", 15, "female"));
        list.add(new People("Иван", 88, "male"));
        list.add(new People("Алина", 30, "female"));
        list.add(new People("Екатерина", 32, "female"));
        list.add(new People("Ольга", 23, "female"));
        list.add(new People("Иван", 24, "male"));
        list.add(new People("Светлана", 87, "female"));
        list.add(new People("Иван", 54, "male"));
        list.add(new People("Владислав", 25, "male"));

        System.out.println("Исходный список: ");
        System.out.println(list);

        System.out.println();
        System.out.println("List sorted by Name: ");
        List<People> list1 = list.stream()
                .sorted(Comparator.comparing(People::getName)).toList();
        list1.forEach(System.out::println);

        System.out.println();
        System.out.println("Name`s length: ");
        list1.stream()
                .map(x -> x.getName().length() + "  ;  ")
                .forEach(System.out::print);
        System.out.println();
        System.out.println();
        System.out.println("Find Ivan in list: ");
        System.out.println(list1.stream()
                .filter(x -> x.getName().equals("Иван"))
                .count());

        System.out.println();
        System.out.println("Return first and last collection`s element or 0(if isEmpty): ");
        list1.stream()
                .findFirst()
                .ifPresent(System.out::println);
        People people1 = new People("test", 0, "test");
        list1.stream()
                .skip(list1.size() - 1)
                .findAny().orElse(people1);


        System.out.println();
        System.out.println("Return 2 elements started index 2");
        list1.stream()
                .skip(2)
                .limit(2)
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Find Youngest women: ");
        list1.stream()
                .min(Comparator.comparing(People::getAge))
                .ifPresent(System.out::println);
        //or
        System.out.println(list.stream()
                .filter(x -> x.getSex().equals("female"))
                .sorted(Comparator.comparing(People::getAge))
                .findFirst().get());

        System.out.println();
        System.out.println("Выбрать мужчин-военнообязанных (от 18 до 27 лет)");
        list1.stream()
                .filter(x -> x.getSex().equals("male") && x.getAge() >= 18 && x.getAge() <= 27)
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Добавить какое-то значение к имени каждого мужчины");
        list1.stream()
                .filter(x -> x.getSex().equals("male"))
                .map(x -> x.getName() + " " + 8)
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Найти кол-во потенциально работоспособных людей");
        list1.stream()
                .filter(x -> (x.getSex().equals("male") && x.getAge() >= 18 && x.getAge() <= 60 ||
                        (x.getSex().equals("female")) && x.getAge() >= 18 && x.getAge() <= 55))
                .forEach(people -> System.out.println("Работоспособные: " + people));

    }
}
