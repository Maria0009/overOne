package lessons.lesson_17.classWork.point_1;

/*Любой объект может обладать двумя основными характеристиками:
 состояние - некоторые данные, которые хранит объект,
 и поведение - действия, которые может совершать объект.*/
public class Person {
    int age;
    String name;

    Person(int personAge, String personName) {
        this.age = personAge;
        this.name = personName;
    }

    void go() {
        System.out.println("Person is walking");
    }

    void printAgeAndName() {
        System.out.println(this.age);
        System.out.println(this.name);
    }
}