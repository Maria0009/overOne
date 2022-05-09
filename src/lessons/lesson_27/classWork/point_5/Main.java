package lessons.lesson_27.classWork.point_5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        File file= new File("Text.txt");
        FileReader fileReader= new FileReader(file);
        FileInputStream fileOutputStream= new FileInputStream(file);
        Scanner scanner= new Scanner(fileReader);
        String str= scanner.nextLine();
        System.out.println(str);
    }
}
