package lessons.lesson_18.classWork.tips_3;



//Создайте зоопарк. У вас есть животные, которые там находятся. У каждого животного есть имя.
// Также есть метод, который возвращает звук этого животного.
//В зоопарке есть метод, вызвав который вам вернет количество животных и все их звуки.
public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.add(new Dog("Chloe"));
        zoo.add(new Cat("Fiona"));
        zoo.add(new Fish("George"));
        zoo.add(new Elephant("Dani"));
        zoo.countOff();
        zoo.soundOff();
    }
}
