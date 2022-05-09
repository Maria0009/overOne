package lessons.lesson_18.classWork.tips_4;

import lessons.lesson_18.classWork.tips_3.Animal;

public class Fish extends Animal {

    public Fish(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "bool, bool!";
    }
}
