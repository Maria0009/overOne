package lessons.lesson_20.homeWork.point_1;

public class Potato extends Vegetable {
    public static final double constant = 70;
    public static final double constantTwo = 100;

    public Potato(double calories, double gram) {
        super(calories, gram);
    }

    @Override
    public double countCalories() {
        return (getCalories() * constant * getGram() / constantTwo);
    }
}
