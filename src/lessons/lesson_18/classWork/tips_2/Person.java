package lessons.lesson_18.classWork.tips_2;

import java.util.Objects;
//1 task
//Создайте класс, у которого будут поля имя и возраст (на англ), обязательно сделайте их приватными.
// У класса должен быть конструктор, который принимает в виде аргументов эти два поля и конструктор без аргументов,
// который присваивает значения по умолчанию для имени и возраста. Добавьте методы, при помощи которых можно
// получить имя и возраст. Создайте метод show(), чтобы он выводил на экран имя и возраст в читаемом формате


public class Person {
    private static String text = "Hello from static";
    private String name;
    private int age;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Person() {
        this.age = 1;
        this.name = "Max";
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void show() {
        System.out.println("Age: " + age + " Name: " + name);
    }
//2 task
//Создайте массив, состоящий из объектов класса из ‘1'. Найдите кол-во одинаковых объектов в массиве


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

//3 task
//Классу из ‘1' добавьте статическое приватное поле text = "Hello from static". Создайте в этом же классе метод,
// который бы выводил на экран это поле и метод, при помощи которого можно изменить значение этого поля.
// В другом классе, с методом main создайте несколько экземпляров класса из 'Task 1'. В одном из них измените значение
// поля 'text' и затем выведите на экран поле 'text' у всех созданных классов. Подумайте почему так.
    public void printText() {
        System.out.println(text);
    }

    public void changeAndShowText(String changText) {
        text = changText;
    }
}
