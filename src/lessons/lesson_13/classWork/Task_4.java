package lessons.lesson_13.classWork;
// Выход из метода
public class Task_4 {
    public static void main(String[] args) {
        daytime(7);
        daytime(13);
        daytime(32);
        daytime(56);
        daytime(2);
    }

    static void daytime(int hour) {
        if (hour > 24 || hour < 0)
            return;
        if (hour > 21 || hour < 6)
            System.out.println("Good night");
        else if (hour >= 15)
            System.out.println("Good evening");
        else if (hour >= 11)
            System.out.println("Good after noon");
        else
            System.out.println("Good morning");
    }
}
