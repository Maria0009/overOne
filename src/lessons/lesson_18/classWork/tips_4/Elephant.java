package lessons.lesson_18.classWork.tips_4;

import lessons.lesson_18.classWork.tips_3.Animal;

public class Elephant extends Animal {

    public Elephant(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "ugh, ugh!";
    }

}
