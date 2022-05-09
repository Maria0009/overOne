package lessons.lesson_20.homeWork.point_1;

public class Cucumber extends Vegetable {

    public static final double constant = 0.45;
    public static final double constantTwo = 100;

    public Cucumber(double calories, double gram) {
        super(calories, gram);
    }

    @Override
    public double countCalories() {
        //0.45 - const
        return (getCalories() * constant * getGram() / constantTwo);
    }
}
