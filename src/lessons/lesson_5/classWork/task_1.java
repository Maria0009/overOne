package lessons.lesson_5.classWork;

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
 /*       for (int i = -3; i < 4; i++) {
            System.out.print(" " + i);
        }
        System.out.println();
        for (int i = 3; i > -4; i--) {
            System.out.print(" " + i);
        }
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = scanner.nextInt();
        int sum = 0;
       for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.print("Result " + sum);
//or
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.print("Result " + sum);
*/
        int amoeba = 1;
        int amountHours=0;
        //why 3? 25 - magic number, use const
        for (int i = 1; i < 25; i++) {
            amountHours++;
            if(amountHours==3){
                amoeba *= 2;
                amountHours=0;
                System.out.println(i + " hours - " + amoeba + " amoeba");
            }
        }


    }
}
