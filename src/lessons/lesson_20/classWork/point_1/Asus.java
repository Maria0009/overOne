package lessons.lesson_20.classWork.point_1;

public class Asus implements  Computer {
    @Override
    public void turnOff() {
        System.out.println("Asus turnOff!");
    }

    @Override
    public void turnOn() {
        System.out.println("Asus turnOn!");
    }

    @Override
    public void reset() {
        System.out.println("Asus reset!");
    }
}
