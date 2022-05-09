package lessons.lesson_20.homeWork.point_1;

public class Tomato extends Vegetable {

    public static final double constant = 0.70;
    public static final double constantTwo = 100;

    public Tomato(double calories, double gram) {
        super(calories, gram);
    }

    @Override
    public double countCalories() {
        return (getCalories() * constant * getGram() / constantTwo);
    }
}
