package lessons.lesson_29.classWork.point_6;

//Написть два потока. Одни - ищет самую длиную строку в массиве.
//Второй - ищет строку, которая начинается с буквы, которая ближе всех к началу алфавита
public class Main {
    public static void main(String[] args) {
        First first = new First("man is not woman", "woman is not", "fffggh");
        Second second = new Second("Hello", "BCD", "avf", "fffggh");
        first.start();
        second.start();
    }
}
