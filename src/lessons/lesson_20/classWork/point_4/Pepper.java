package lessons.lesson_20.classWork.point_4;

public class Pepper extends Vegetable {

    public Pepper(double calories, double gram) {
        super(calories, gram);
    }

    @Override
    public double countCalories() {
        return (getCalories() * 0.65 * getGram() / 100);
    }
}
