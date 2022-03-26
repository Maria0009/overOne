package lessons.lesson_20.classWork.point_4;

public class Onion extends Vegetable {

    public Onion(double calories, double gram) {
        super(calories, gram);
    }

    @Override
    public double countCalories() {
        return (getCalories() * 5 * getGram() / 100);
    }
}
