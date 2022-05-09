package lessons.lesson_13.classWork;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        double x = 28;
        double y = 4;

        // return the maximum of two numbers
        System.out.println("Maximum number of x and y is: " + Math.max(x, y));

        // return the square root of y
        System.out.println("Square root of y is: " + Math.sqrt(y));

        //returns 28 power of 4 i.e. 28*28*28*28
        System.out.println("Power of x and y is: " + Math.pow(x, y));

        // return the logarithm of given value
        System.out.println("Logarithm of x is: " + Math.log(x));
        System.out.println("Logarithm of y is: " + Math.log(y));

        // return the logarithm of given value when base is 10
        System.out.println("log10 of x is: " + Math.log10(x));
        System.out.println("log10 of y is: " + Math.log10(y));
        //Task_2.sum(9, 9, 9);// Если метод в том классе static можно вызвать через название класса.метод
        Task_3.daytime(8);
        //Если не static создаем через new
        Task_2 exumple=new Task_2();
        exumple.sum(1,2,4);
        //if method is not static, then create object using 'new':
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();// nextInt() no static

    }
}
