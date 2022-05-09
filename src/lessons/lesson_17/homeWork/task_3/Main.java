package lessons.lesson_17.homeWork.task_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int x= scanner.nextInt();
        int y= scanner.nextInt();
        Square a=new Square(x);
        Circle b=new Circle(y);
        a.area();
        b.area();
    }
}

