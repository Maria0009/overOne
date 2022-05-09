package lessons.lesson_29.classWork.point_4;

public class DexSeconds extends Thread {
    private int dexSecs = 0;

    public int getDexSecs() {
        return dexSecs;
    }

    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 100; i++) {
                dexSecs = i;
                try {
                    sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
