package lessons.lesson_19.homeWork.point_1;

//Task 1 (на интерфейс)
// Есть интерфейс Computer,у которого есть методы включить, выключить и резет.
// Создайте класс, который бы имплементировал этот интерфейс
//+
public class Main {
    public static void main(String[] args) {
        Program program1 = new Program("on", "works good");
        program1.printStatus();
        program1.reset();
        program1.printStatus();
        program1.turnOnOrTurnOff();
        program1.printStatus();
        System.out.println();
        Program program2 = new Program("off", "works bad");
        program2.printStatus();
        program2.reset();
        program2.printStatus();
        program2.turnOnOrTurnOff();
        program2.printStatus();
        System.out.println();
        Program program3 = new Program("off", "works good");
        program3.printStatus();
        program3.reset();
        program3.printStatus();
        program3.turnOnOrTurnOff();
        program3.printStatus();

    }
}
