package lessons.lesson_19.homeWork.point_1;

//Task 1 (на интерфейс)
// Есть интерфейс Computer,у которого есть методы включить, выключить и резет.
// Создайте класс, который бы имплементировал этот интерфейс
public interface Computer {
    String turnOn();

    String turnOff();

    String reset();
}
