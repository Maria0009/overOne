package lessons.lesson_6.classWork;

import java.util.Scanner;

public class task {
    public static void main(String[] args) {
/* //task1
        final int END_NUMBER=11;
        for(int i=1;i<END_NUMBER;i++){
            System.out.print(i+" ");
        }
        System.out.println();
//task2
        System.out.println("Enter number: ");
        Scanner scanner=new Scanner(System.in);
        int number= scanner.nextInt();
        int factor=1;
        for(int i=1;i<=number;i++){
            factor*=i;
        }
        System.out.println(factor);
        System.out.println();
//task3
        System.out.println("Enter number: ");
        int n= scanner.nextInt();
        double sum=0;
        for(double i=1;i<=n;i++){
            sum+=1/i;
        }
        System.out.println("Sum: "+sum);

        int counter=10;
        while(counter>=0){
            System.out.print(counter+" ");
            counter--;
        }

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number: ");
        int inputNumber= scanner.nextInt();
        double sum=0;
        double i=1;
        while(i<=inputNumber){
            sum+=1/i;
            i++;
        }
        System.out.println("Sum: "+sum);

//Example do{} while();
        int x=10;
        do{
            System.out.print(x+" ");
            x++;
        }while (x<15);


//Example break;continue;
        for (int i = 0; i < 10; i++) {
            if (i == 5)
                //break;
                continue;
                System.out.println(i);
        }
*/

        //Доработка дз 4 задача
        final int LIMIT = 100;
        int i = 0;
        int sumEven = 0;
        int sumOdd = 0;
        int result;
        while (i <= LIMIT) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
            i++;
        }
        System.out.println("Sum of even number:");
        System.out.println(sumEven);
        System.out.println("Sum of odd number:");
        System.out.println(sumOdd);

        System.out.println();
        System.out.println("Sum:");
        result = sumEven + sumOdd;
        System.out.println(result);
/*
   /**
   *for documentation
   */

    }
}

