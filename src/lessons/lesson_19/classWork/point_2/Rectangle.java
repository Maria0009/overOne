package lessons.lesson_19.classWork.point_2;

public class Rectangle extends Figure {
    private float width;
    private float height;

    Rectangle(float x, float y, float width, float height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    Rectangle(float width, float height) {
        super();
        this.width = width;
        this.height = height;
    }

    public float getPerimeter() {
        return width * 2 + height * 2;
    }

    public float getArea() {
        return width * height;
    }
}
