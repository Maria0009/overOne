package lessons.lesson_13.classWork;

public class Task_5 {
    public static void main(String[] args) {
        System.out.println(sum(2, 3));
        System.out.println(sum(4.5, 3.2));
        System.out.println(sum(4, 3, 7));
    }

    static int sum(int x, int y) {
        return x + y;
    }

//Перегрузка
    static int sum(int x, int y, int z) {
        return x + y + z;
    }
// Не перегрузка (другой тип возвращаемого элемента)
    static double sum(double x, double y) {
        return x + y;
    }
}

