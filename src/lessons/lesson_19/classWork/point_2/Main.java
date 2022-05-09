package lessons.lesson_19.classWork.point_2;

public class Main {
    public static void main(String[] args) {
        //мы не можем использовать конструктор абстрактного класса для создания его объекта.
//        Human h = new Human();
        Person john = new Client("John");
        Person alex = new Employee("Alex");
        john.display();
        alex.display();
    }
}
