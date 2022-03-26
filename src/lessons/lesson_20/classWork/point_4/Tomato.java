package lessons.lesson_20.classWork.point_4;

public class Tomato extends Vegetable {

    public Tomato(double calories, double gram) {
        super(calories, gram);
    }

    @Override
    public double countCalories() {
        return (getCalories() * 0.75 * getGram() / 100);
    }
}
