package lessons.lesson_19.classWork;

public class Task {
//Все классы наследуются от Object

// Методы Object:
    //toString() -  служит для получения представления данного объекта в виде строки
    //hashCode() - позволяет задать некоторое числовое значение, которое будет соответствовать
      // данному объекту или его хэш-код. По данному числу, например, можно сравнивать объекты.
    //getClass() - озволяет получить тип данного объекта
    //equals() - сравнивает два объекта на равенство

// Оператор instanceof// Сам класс и все родители является true
    //        String name = "James";
    //        boolean result = name instanceof String;// following will return true since name is type of String
    //        System.out.println(result);
    //        Vehicle vehicle = new Car();
    //        System.out.println(vehicle instanceof Car);

// Абстрактные класс: класс в котором нельзя создать объект этого класса
//      public abstract class Human {
//           private String name;
//      }
    //мы не можем использовать конструктор абстрактного класса для создания его объекта.
//        Human h = new Human();
// абстрактные методы: методы которые не имеют реализации
// public abstract void display(); // необходимо обязательно реализовать в дочерних классах

// Интерфейсы// может содержать множественное наследование //public class Animal implements AnimalEat, AnimalTravel {}
// В Java нет множественного наследования классов, но есть множественное наследование интерфейсов
// Интерфейсы реализуем, от классов насследуемся, абстрактный класс расширяется
        // public interface Vehicle {
        // all are the abstract methods.
        //    void changeGear(int a);
        //    void speedUp(int a);
        //    void applyBrakes(int a);
        //}
//Слово implements как extends, также можно использовать public class B extends C implements A
// т.е.   public class Animal extends Demo implements AnimalEat, AnimalTravel
    // default and static в interface  не нужно обязательно в implements реализовываться но можно их переопределить
    // обычеые методы в интерфейсах должны реализовывать в имплементс классах
    // к полям интерфеса обращается через название интерфес метода точка название переменной, т.к. все параметры
    // в интерфейс классах поля по умолчанию  static final
// У интерфесов нет конструктора
}
