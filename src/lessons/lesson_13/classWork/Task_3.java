package lessons.lesson_13.classWork;

public class Task_3 {
    public static void main(String[] args) {
        String daytime1=daytime(7);
        System.out.println(daytime1);
        System.out.println(daytime(13));
        System.out.println(daytime(18));
        System.out.println(daytime(2));
    }

    static String daytime(int hour) {
        if (hour > 24 || hour < 0) {
            return "Invalid data";
        } else if (hour > 21 || hour < 6) {
            return "Good night";
        } else if (hour >= 15) {
            return "Good evening";
        } else if (hour >= 11) {
            return "Good after noon";
        } else {
            return "Good morning";
        }
    }


}
