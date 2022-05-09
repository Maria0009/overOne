package lessons.lesson_27.classWork.point_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file= new File("Int.txt");
        FileReader fileReader= new FileReader(file);
    }
}
