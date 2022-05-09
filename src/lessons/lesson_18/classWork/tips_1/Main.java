package lessons.lesson_18.classWork.tips_1;

public class Main {
    public static void main(String[] args) {
        Money income=new Money(55,"USD");
        Money expenses=new Money(55,"USD");

        Boolean result=income.equals(expenses);// если метод equals непереопределен то будет false
        System.out.println(result);

        System.out.println(income);//Необходимо переопределить метод toString() чтобы в нормальном виде вывести через sout()
    }
}
