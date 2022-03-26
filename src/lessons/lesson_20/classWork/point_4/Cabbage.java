package lessons.lesson_20.classWork.point_4;

public class Cabbage extends Vegetable {

    public Cabbage(double calories, double gram) {
        super(calories, gram);
    }

    @Override
    public double countCalories() {
        return getCalories() * getGram() / 100;
    }
}
