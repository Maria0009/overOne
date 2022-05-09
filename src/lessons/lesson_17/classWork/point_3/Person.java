package lessons.lesson_17.classWork.point_3;

public class Person {
    private int id;
    static int counter = 1;

    Person() {
        id = counter++;
    }

    public void displayId() {

        System.out.printf("Id: %d \n", id);
    }
}
