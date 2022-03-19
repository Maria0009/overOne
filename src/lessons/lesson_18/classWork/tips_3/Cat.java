package lessons.lesson_18.classWork.tips_3;

public class Cat extends Zoo {

    public Cat(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "meow!";
    }
}
