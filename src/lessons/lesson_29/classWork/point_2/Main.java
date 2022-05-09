package lessons.lesson_29.classWork.point_2;

//Два потока один искать мах другой минимальный элемент массива
public class Main {
    public static void main(String[] args) {
        First first = new First(3, 4, 5);
        Second second = new Second(7, 8, 9);
        first.start();
        second.start();
    }
}
