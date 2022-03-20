package lessons.lesson_19.homeWork.point_2;

//Task 2 (на абстрактный класс)
// Есть два типа домов - городская многоэтажка и загородный дом.
// У каждого типа дома есть методы "получить кол-во этажей", "включить отопление", "получить кол-во жильцов".
// Есть каталог домов (например класс, внутри которого какой-то массив).
// Создайте каталог и поместите туда несколько домов.
public class Catalog {
    private int count;
    private Home[] homes;

    public Catalog() {
        homes = new Home[20];//ok, but we can improve it by passing array length as constructor parameter
        this.count = 0;
    }

    public void add(Home home) {//добавляет
        homes[count++] = home;
    }

    public void outCatalog() {
        for (int i = 0; i < count; ++i) {
            System.out.println(homes[i].getClass().getSimpleName());
            System.out.println("Number of floor: " + homes[i].getNumberFloors());
            System.out.println(homes[i].getHeating());//all the methods have 1 implementation in Home class. Maybe we can make this method abstract
            //to practise it's usage. Just an advise:)
            System.out.println("Number of people: " + homes[i].getNumberPeople());
            System.out.println();
        }
    }

}
