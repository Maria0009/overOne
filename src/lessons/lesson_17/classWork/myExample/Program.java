package lessons.lesson_17.classWork.myExample;

public class Program {
    public static void main(String[] args) {
    //Создание объекта (экземпляр класса) с собственным состоянием этих полей
    Person person= new Person(17,"Alex");
    person.printAgeAndName();
//      person.go();
//      person.name="Alex";
//      person.age=17;
//
      Person person1=new Person(18,"Maks");
      person1.printAgeAndName();

      Student student=new Student();
      student.displayInfo();

    }

}
