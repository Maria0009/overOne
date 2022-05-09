package lessons.lesson_20.classWork.point_2;

import lessons.lesson_19.homeWork.point_2.TownHome;
import lessons.lesson_19.homeWork.point_2.VillageHome;

//Есть два типа домов - городская многоэтажка и загородный дом.
// У каждого типа дома есть методы "получить кол-во этажей", "включить отопление", "получить кол-во жильцов".
// Есть каталог домов (например класс, внутри которого какой-то массив).
// Создайте каталог и поместите туда несколько домов.
public class Main {
    public static void main(String[] args) {
        Catalog catalog=new Catalog();
        catalog.addHome(new Skyscraper(25,56,false));
        catalog.addHome(new Skyscraper(25,156,true));
        catalog.addHome(new Skyscraper(5,256,false));
        catalog.addHome(new Skyscraper(5,756,true));
        catalog.addHome(new Skyscraper(2,546,false));
        catalog.outCatalog();
    }
}
