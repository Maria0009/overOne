package lessons.lesson_19.classWork.point_2;

public class Client extends Person {
    public Client(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("Client " + getName());
    }
}
