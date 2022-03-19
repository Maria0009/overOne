package lessons.lesson_18.classWork.tips_3;

//Создайте зоопарк. У вас есть животные, которые там находятся. У каждого животного есть имя.
//Также есть метод, который возвращает звук этого животного.
//В зоопарке есть метод, вызвав который вам вернет количество животных и все их звуки.
public class Zoo {

    private String name;
    private int id;
    static int counter = 1;

    public Zoo(String name) {
        this.name = name;
    }

    public Zoo() {
    }

    public String getName() {
        System.out.println(name);
        return name;
    }

    public String sound() {
        return "voice of animals";
    }

    public void add(Zoo animal) {
        id = counter++;
        System.out.print(animal);
        System.out.println(animal.sound());
    }

    public void countOff() {
        System.out.println("This zoo has " + id + " animals.");
    }

    @Override
    public String toString() {
        return name + " says ";
    }
}
