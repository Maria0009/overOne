package lessons.lesson_18.classWork.tips_3;

public class Elephant extends Zoo {

    public Elephant(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "ugh, ugh!";
    }
}
