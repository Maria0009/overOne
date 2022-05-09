package lessons.lesson_19.classWork.point_3.sub_2;

public class TestClass implements In1 {
    private int num = 10000;

//    @Override
//    public void defaultDisplay() {
//        System.out.println("Hello from + " + getClass());
//    }

    public static void main(String[] args) {
        TestClass t = new TestClass();
        t.defaultDisplay();
        In1.staticDisplay();
        System.out.println("Value of num of the interface " + In1.num);
        System.out.println("Value of num of the class " + t.num);
//        In1.num = 200;
    }
}
