package lessons.lesson_27.classWork.point_1;

import lessons.lesson_18.classWork.tips_3.Fish;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        }catch (Exception e){
////            System.exit(1); // тогда finally не будет работать или блок while(true);
////            while (true){
////            }
//            e.printStackTrace();
//        }finally {
//
//        }

        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        try {
            int a = 5 / b;
        } catch (Exception arithmetic) {
            arithmetic.printStackTrace();
        } finally {

        }
//
        String str = " ";
        File file = new File("input.txt");
        try {
            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
//            e.printStackTrace();
            str = "Empty file";
        } finally {
            System.out.println(str);
        }

    }
}
