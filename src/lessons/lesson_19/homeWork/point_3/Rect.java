package lessons.lesson_19.homeWork.point_3;

public class Rect {

    private int upLeftFirst;
    private int upLeftSecond;
    private int downRightFirst;
    private int downRightSecond;
    private double height;
    private double width;

    public Rect() {
    }

    public Rect(int upLeftFirst, int upLeftSecond, int downRightFirst, int downRightSecond) {
        this.upLeftFirst = upLeftFirst;
        this.upLeftSecond = upLeftSecond;
        this.downRightFirst = downRightFirst;
        this.downRightSecond = downRightSecond;

    }

    public Rect(int upLeftFirst, int upLeftSecond, double height, double width) {
        this.upLeftFirst = upLeftFirst;
        this.upLeftSecond = upLeftSecond;
        this.height=height;
        this.width=width;
    }
}
