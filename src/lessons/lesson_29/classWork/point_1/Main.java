package lessons.lesson_29.classWork.point_1;

public class Main {
    public static void main(String[] args) {
        //Потоки (с большой буква)
        //New => start => Runable => run => Running => stop => Dead
        //меленькими это методы
        //Blocked => notify => Runable
        Person person1 = new Person("Ivan", "Max", "Vasiliy");
        Person person2 = new Person("Sergey", " Alex", "Roman");
        person1.start();
        person2.start();
    }
}
