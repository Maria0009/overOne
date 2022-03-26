package lessons.lesson_20.classWork.point_4;

//Определить иерархию овощей. Сделать салат. Подсчитать калорийность (для каждого овоща пусть будет своя формула)
// Найти овощи в салате, соответствующие заданному диапазону калорийности,
// а также просто вывести все овощи в салате вместе с граммовкой. Посчитать итоговый вес салата.
//++++
public class Main {
    public static void main(String[] args) {
        Salad salad = new Salad();
        salad.add(new Tomato(540, 100));
        salad.add(new Potato(4, 20));
        salad.add(new Cabbage(100, 30));
        salad.add(new Cucumber(54, 50));
        salad.add(new Onion(240, 100));
        salad.add(new Pepper(760, 120));
        salad.outAllVegetables();
        salad.outAllVegetablesInSalad(salad.findVegetableInSalad());
        System.out.println("The weight salad is: " + salad.weight(salad.findVegetableInSalad()));
    }
}
