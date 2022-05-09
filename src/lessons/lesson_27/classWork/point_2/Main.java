package lessons.lesson_27.classWork.point_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        try {
            double result = 5 / number;
        } catch (ArithmeticException arithmeticException) {
            System.out.println("You try divide by null");
            while (number == 0) {
                System.out.println("Enter new number");
                number = scanner.nextInt();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println(5/number);
        }
    }
}
