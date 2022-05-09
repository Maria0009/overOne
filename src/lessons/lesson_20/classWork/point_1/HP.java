package lessons.lesson_20.classWork.point_1;

public class HP implements Computer {

    @Override
    public void turnOff() {
        System.out.println("HP is turnOff");
    }

    @Override
    public void turnOn() {
        System.out.println("HP is turnOn");
    }

    @Override
    public void reset() {
        System.out.println("HP is reset");
    }
}
