package lessons.lesson_20.homeWork.point_1;

//Определить иерархию овощей. Сделать салат. Подсчитать калорийность (для каждого овоща пусть будет своя формула)
// Найти овощи в салате, соответствующие заданному диапазону калорийности,
// а также просто вывести все овощи в салате вместе с граммовкой. Посчитать итоговый вес салата.
public class Salad {
    Vegetable[] vegetables;
    private int counter;
    private int min;
    private int max;

    public Salad() {
        vegetables = new Vegetable[10];
        counter = 0;
    }

    public void add(Vegetable vegetable) {
        vegetables[counter++] = vegetable;
    }

    public Vegetable[] findVegetableInSalad(int min, int max) {
        this.min = min;
        this.max = max;
        Vegetable[] newVegetables = new Vegetable[findLength()];
        int count = 0;
        for (int i = 0; i < counter; i++) {
            // iterate on vegetables.length
            //and then remove null values
            if (vegetables[i].countCalories() >= min && vegetables[i].countCalories() <= max) {
                newVegetables[count] = vegetables[i];
                count++;
            }
        }
        return newVegetables;
    }

    private int findLength() {
        int length = 0;
        for (int i = 0; i < counter; i++) {
            if (vegetables[i].countCalories() >= min && vegetables[i].countCalories() <= max) {
                length++;
            }
        }
        return length;
    }

    public void outAllVegetablesInSalad(Vegetable[] vegetable) {
        for (int i = 0; i < findVegetableInSalad(min, max).length; i++) {
            System.out.println("Salad include: " + vegetable[i].getClass().getSimpleName() + " with " + vegetable[i].getGram() + " gram.");
        }
        System.out.println();
    }

    public void outAllVegetables() {
        for (int i = 0; i < counter; i++) {
            System.out.println("All vegetables is " + vegetables[i].getClass().getSimpleName() + " with "
                    + vegetables[i].getGram() + " gram and " + vegetables[i].countCalories() + " calories.");
        }
        System.out.println();
    }

    public double weight(Vegetable[] vegetable) {
        int weight = 0;
        for (int i = 0; i < findVegetableInSalad(min, max).length; i++) {
            weight += vegetable[i].getGram();
        }
        return weight;
    }


}
