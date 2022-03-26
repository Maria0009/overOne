package lessons.lesson_20.classWork.point_4;

//Определить иерархию овощей. Сделать салат. Подсчитать калорийность (для каждого овоща пусть будет своя формула)
// Найти овощи в салате, соответствующие заданному диапазону калорийности,
// а также просто вывести все овощи в салате вместе с граммовкой. Посчитать итоговый вес салата.
//+
public abstract class Vegetable {
    private double calories;
    private double gram;

    public Vegetable(double calories, double gram) {
        this.calories = calories;
        this.gram = gram;
    }

    public double getCalories() {
        return calories;
    }

    public double getGram() {
        return gram;
    }

    public abstract double countCalories();

}
