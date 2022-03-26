package lessons.lesson_20.classWork.point_4;

public class Cucumber extends Vegetable {

    public Cucumber(double calories, double gram) {
        super(calories, gram);
    }

    @Override
    public double countCalories() {
        return (getCalories() * 0.45 * getGram() / 100);
    }
}
