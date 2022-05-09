package lessons.lesson_17.homeWork.task_1;

public class Main {
    public static void main(String[] args) {
        Person vitya =new Person(120,"Vitya");
        //vitya.height=120;
        System.out.println(vitya.height+" and "+vitya.name);
        vitya.say("Vlad");
        Person vlad=new Person();
        System.out.println(vlad.height);

        Student freshman= new Student(76, "Viktor",2);
        freshman.tell();
    }
}
