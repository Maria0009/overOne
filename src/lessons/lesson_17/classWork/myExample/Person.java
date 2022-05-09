package lessons.lesson_17.classWork.myExample;

public class Person {//Шаблон с характеристиками
    int age;//Характеристика объекта(поле класса)
    String name;

//    //Создание конструктора по умолчанию (он автоматически создается, его не нужно создавать)
//    Person(){
//
//    }

    //Конструктор с параметрами// Только присваивает названия полей
    Person(int personAge, String personName){
       this.age=personAge;
       this.name=personName;
    }

    void go(){  //Метод(действие)
        System.out.println("Person is walking");
    }

    void printAgeAndName(){
        System.out.println(age);
        System.out.println(name);
    }
}
