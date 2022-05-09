package lessons.lesson_29.classWork.point_4;

public class Minutes extends Thread {
    private int minutes = 0;

    public int getMinutes() {
        return minutes;
    }

    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 60; i++) {
                minutes = i;
                try {
                    sleep(60000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
