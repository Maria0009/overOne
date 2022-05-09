package lessons.lesson_18.classWork.tips_4;

import lessons.lesson_18.classWork.tips_3.Animal;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "woof, woof!";
    }
}
