package lessons.lesson_17.homeWork.task_3;

public class Circle extends Shape {
    public Circle(int y) {
        super(y);
    }

    @Override
    void area() {
        System.out.println(Math.PI*width*width);

    }

}
