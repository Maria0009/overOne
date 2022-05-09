package lessons.lesson_29.classWork.point_2;

public class First extends Thread {
    Integer a[];

    public First(Integer... a) {
        this.a = a;
    }

    @Override
    public void run() {
        int max = a[0];
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Max: " + max);
    }
}
