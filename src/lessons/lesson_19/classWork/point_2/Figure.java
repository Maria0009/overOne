package lessons.lesson_19.classWork.point_2;

public abstract class Figure {
    private float x;
    private float y;

    Figure(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Figure() {
    }

    public abstract float getPerimeter();

    public abstract float getArea();
}
