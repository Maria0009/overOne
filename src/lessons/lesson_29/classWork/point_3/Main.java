package lessons.lesson_29.classWork.point_3;

//Написать два потока. Первый будет выводить нечетные числа, второй четные
//с интервалом 0.2 секунды
public class Main {
    public static void main(String[] args) {
        First first = new First();
        Second second = new Second();
        first.start();
        second.start();
    }
}
