package lessons.lesson_29.classWork.point_4;

public class Hour extends Thread {
    private int hours = 0;

    public int getHours() {
        return hours;
    }

    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 100; i++) {
                hours = i;
                try {
                    sleep(3600000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
