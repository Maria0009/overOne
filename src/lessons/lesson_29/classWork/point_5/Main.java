package lessons.lesson_29.classWork.point_5;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Time time = new Time();
        time.start();
        System.out.println("Hr:Min:Secs");
        while (true) {
            System.out.println(time.getHours() + " : " + time.getMinutes() + " : " + time.getSeconds());
            Thread.sleep(999);
        }
    }
}
