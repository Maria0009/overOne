package lessons.lesson_18.classWork.tips_3;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "woof, woof!";
    }
}
