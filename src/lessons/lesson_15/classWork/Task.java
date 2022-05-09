package lessons.lesson_15.classWork;

public class Task {
    public static void main(String[] args) {
        String str="Java";
        String str2="C++";
        StringBuffer strBuffer= new StringBuffer(str);

        strBuffer.append("str");
        System.out.println(strBuffer);

        strBuffer.replace(0,str.length(),str2);
        System.out.println(strBuffer);

        //BenchMarkTest скорость работы программы
        //StringBuilder не потокобезопасный, но работает быстрее

        //        String str=initString(scanner);
//        if(Pattern.matches("[\\s]{2,}", str)){
//
//        }
    }
}
