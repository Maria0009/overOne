package lessons.lesson_18.classWork.tips_4;

import lessons.lesson_18.classWork.tips_3.Animal;

//Создайте зоопарк. У вас есть животные, которые там находятся. У каждого животного есть имя.
//Также есть метод, который возвращает звук этого животного.
//В зоопарке есть метод, вызвав который вам вернет количество животных и все их звуки.
public class Zoo {

    private int count;
    private Animal[] animals;

    public Zoo() {
        animals = new Animal[10];
        this.count = 0;
    }

    public void add(Animal animal) {//добавляет
        animals[count++] = animal;
    }

    public void countOff() {
        System.out.println("This zoo has " + count + " animals.");
    }

    public void soundOff() {
        for (int i = 0; i < count; ++i) {
            System.out.println(animals[i].getName() + " says " + animals[i].sound());
        }
    }

}
