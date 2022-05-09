package lessons.lesson_20.homeWork.point_1;

public class Cabbage extends Vegetable {

    public static final double constant = 100;

    public Cabbage(double calories, double gram) {
        super(calories, gram);
    }

    @Override
    public double countCalories() {
        return getCalories() * getGram() / constant;
    }
}
