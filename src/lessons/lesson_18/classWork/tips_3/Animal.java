package lessons.lesson_18.classWork.tips_3;

//Создайте зоопарк. У вас есть животные, которые там находятся. У каждого животного есть имя.
//Также есть метод, который возвращает звук этого животного.
//В зоопарке есть метод, вызвав который вам вернет количество животных и все их звуки.
public class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String sound() {
        return "voice of animals";
    }

}
