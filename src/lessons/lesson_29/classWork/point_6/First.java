package lessons.lesson_29.classWork.point_6;

//Написть два потока. Одни - ищет самую длиную строку в массиве.
//Второй - ищет строку, которая начинается с буквы, которая ближе всех к началу алфавита
public class First extends Thread {

    private String[] str;
    private String newString = " ";

    public First(String... str) {
        this.str = str;
    }

    @Override
    public void run() {
        int max = str[0].length();
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() >= max) {
                max = str[i].length();
                newString = str[i];
            }
        }
        System.out.println(newString);
    }
}
