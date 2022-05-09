package lessons.lesson_19.classWork.point_3.sub_2;

public interface In1 {
    public static final int num = 100;

    default void defaultDisplay() {
        System.out.println("hello from default");
    }

    static void staticDisplay() {
        System.out.println("hello from static");
    }
}
