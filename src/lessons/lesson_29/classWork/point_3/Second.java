package lessons.lesson_29.classWork.point_3;

public class Second extends Thread{
    @Override
    public void run() {
        try {
            sleep(100);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        for (int i = 2; i <= 100; i+=2) {
            System.out.println(i);
            try {
                sleep(200);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
