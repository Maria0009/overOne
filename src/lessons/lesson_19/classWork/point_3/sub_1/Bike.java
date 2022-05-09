package lessons.lesson_19.classWork.point_3.sub_1;

public class Bike implements Vehicle {
    private int speed;
    private int gear;

    // to change gear
    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    // to increase speed
    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    // to decrease speed
    @Override
    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("speed: " + speed
                + " gear: " + gear);
    }
}
