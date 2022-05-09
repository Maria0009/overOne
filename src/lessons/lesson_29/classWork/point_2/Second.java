package lessons.lesson_29.classWork.point_2;

public class Second extends Thread {
    Integer a[];

    public Second(Integer... a) {
        this.a = a;
    }

    public void run() {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Min: " + min);
    }
}
