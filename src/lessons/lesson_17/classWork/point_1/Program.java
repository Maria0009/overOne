package lessons.lesson_17.classWork.point_1;

public class Program {
    public static void main(String[] args) {
// Класс представляет новый тип, поэтому мы можем определять переменные, которые представляют данный тип.
        Person person = new Person(17, "Alex");
        person.printAgeAndName();
        System.out.println("person.name = " + person.name);
        person.name = "John";
        person.age = 12;
        person.printAgeAndName();
        person.go();
        person.name = "Alex";
        person.age = 17;

//        Person person1 = new Person();
//        person1.name = "John";
//        person1.age = 12;
//        person1.printAgeAndName();

        Student student = new Student();
//        student.displayInfo();
        student.displayPublicInfo();
    }
}
