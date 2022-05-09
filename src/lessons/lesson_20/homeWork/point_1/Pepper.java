package lessons.lesson_20.homeWork.point_1;

public class Pepper extends Vegetable {

    public static final double constant = 0.65;
    public static final double constantTwo = 100;

    public Pepper(double calories, double gram) {
        super(calories, gram);
    }

    @Override
    public double countCalories() {
        return (getCalories() * constant * getGram() / constantTwo);
    }
}
