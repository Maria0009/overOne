package lessons.lesson_17.homeWork.task_2;

public class Main {
    public static void main(String[] args) {
        Shape[] arr = new Shape[]{new Circle(), new Square(), new Triangle()};
        for (int i = 0; i < arr.length; i++) {
            arr[i].draw();
        }
        Shape circle=new Circle();
        circle.draw();
    }
}
