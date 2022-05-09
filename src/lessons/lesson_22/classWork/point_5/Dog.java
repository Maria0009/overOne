package lessons.lesson_22.classWork.point_5;

public class Dog implements Animal {
    private String name = "Sharik";

    public String getName() {
        return name;
    }

    @Override
    public void makeSound() {
        System.out.println("Gav");
    }

    @Override
    public void food() {
        System.out.println("Meat");
    }
}
