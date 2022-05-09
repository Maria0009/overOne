package lessons.lesson_17.homeWork.task_1;

public class Person {
    public int height = 180;
    public String name="Default";
    public void say(String name) {
        System.out.println("Hello " + name);
    }

    public Person(int h) {
        height = h;
    }
    public Person() {
    }
    public Person(int h, String n) {
        height = h;
        name=n;
    }
}
