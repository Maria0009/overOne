package lessons.lesson_17.classWork.point_3;

public class Program {
    public static void main(String[] args) {
        Person tom = new Person();
        Person bob = new Person();

        tom.displayId();    // Id = 1
        bob.displayId();    // Id = 2
        System.out.println(Person.counter); // 3

        // изменяем Person.counter
        Person.counter = 8;

        Person sam = new Person();
        sam.displayId();    // Id = 8
    }
    /*
    Класс Person содержит статическую переменную counter,
    которая увеличивается в конструкторе и ее значение
    присваивается переменной id. То есть при создании каждого
    нового объекта Person эта переменная будет увеличиваться,
    поэтому у каждого нового объекта Person значение поля id будет
    на 1 больше чем у предыдущего.
     */
}