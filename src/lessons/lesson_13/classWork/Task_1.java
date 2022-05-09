package lessons.lesson_13.classWork;

public class Task_1 {
    public static void main(String[] args) {
        welcome();
        int a = 3;
        int b = 4;
        sum(a, b);
        String text = "Text";
        int age = 5;
        display(text, age);
        sum1(1,2,3,4,666);
        sum1();
        sum2("text", 1,2,3);

    }

    static void welcome() {
        System.out.println("Welcome to Java");
    }

    static void sum(int x, int y) {
        int z = x + y;
        System.out.println(z);
    }

    static void display(String name, int age) {
        System.out.println(name);
        System.out.println(age);
    }

//Методы переменной длины

    static void sum1(int... nums) {    //nums this is array
        int result = 0;
        for (int n : nums) {
            result += n;
        }
        System.out.println(result);
    }

    static void sum2(String message, int... nums) {     // массив с ... должен быть в конце

        System.out.println(message);
        int result = 0;
        for (int x : nums) {
            result += x;
        }
        System.out.println(result);
    }
}
