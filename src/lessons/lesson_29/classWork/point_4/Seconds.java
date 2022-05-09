package lessons.lesson_29.classWork.point_4;

public class Seconds extends Thread {
    private int seconds = 0;

    public int getSeconds() {
        return seconds;
    }

    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 60; i++) {
                seconds = i;
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
