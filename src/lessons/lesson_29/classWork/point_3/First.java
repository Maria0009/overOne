package lessons.lesson_29.classWork.point_3;

public class First extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i+=2) {
            System.out.println(i);
            try {
                sleep(200);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
