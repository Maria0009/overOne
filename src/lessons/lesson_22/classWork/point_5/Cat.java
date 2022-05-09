package lessons.lesson_22.classWork.point_5;

public class Cat implements Animal {
    private String name = "Barsik";

    public String getName() {
        return name;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public void food() {
        System.out.println("Fish");
    }
}
