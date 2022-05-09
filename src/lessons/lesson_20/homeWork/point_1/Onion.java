package lessons.lesson_20.homeWork.point_1;

public class Onion extends Vegetable {

    public static final double constant = 5;
    public static final double constantTwo = 100;

    public Onion(double calories, double gram) {
        super(calories, gram);
    }

    @Override
    public double countCalories() {
        //5->const
        return (getCalories() * constant * getGram() / constantTwo);
    }
}
