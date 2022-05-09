package lessons.lesson_17.homeWork.task_3;


public class Square extends Shape {
    public Square(int x) {
        super(x);
    }
    @Override
    void area() {
        System.out.println(width*width);

    }

}