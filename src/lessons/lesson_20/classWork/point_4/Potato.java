package lessons.lesson_20.classWork.point_4;

public class Potato extends Vegetable {

    public Potato(double calories, double gram) {
        super(calories, gram);
    }

    @Override
    public double countCalories() {
        return (getCalories() * 70 * getGram() / 100);
    }
}
