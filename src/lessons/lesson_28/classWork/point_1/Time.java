package lessons.lesson_28.classWork.point_1;

//Написать секундомер с одним потоком
public class Time extends Thread {
    private int seconds = 0;
    private int minutes = 0;
    private int hours = 0;

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    @Override
    public void run() {
        while (true) {
            for (int k = 0; k < 60; k++) {
                hours = k;
                for (int j = 0; j < 60; j++) {
                    minutes = j;
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
    }
}
