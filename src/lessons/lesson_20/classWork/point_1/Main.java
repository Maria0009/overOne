package lessons.lesson_20.classWork.point_1;

//Есть интерфейс Computer,у которого есть методы включить, выключить и резет.
// Создайте класс, который бы имплементировал этот интерфейс
public class Main {
    public static void main(String[] args) {
        Computer hp = new HP();
        Asus asus= new Asus();
        System.out.println(asus instanceof Computer);
        callMethods(hp);
        callMethods(asus);
    }

    public static void callMethods(Computer computer){
        computer.turnOff();
        computer.turnOn();
        computer.reset();
    }
}
