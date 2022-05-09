package lessons.lesson_29.classWork.point_4;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Hour hour = new Hour();
        Minutes minutes = new Minutes();
        Seconds second = new Seconds();
        DexSeconds dexSeconds = new DexSeconds();
        dexSeconds.start();
        second.start();
        minutes.start();
        hour.start();
        System.out.println("Hour:Minutes:Seconds:DexSeconds");
        while (true) {
            System.out.println(hour.getHours() + " : " + minutes.getMinutes() + " : " + second.getSeconds() + " : " + dexSeconds.getDexSecs());
            Thread.sleep(1000);
        }
    }
}
