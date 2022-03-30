package lessons.lesson_21.homeWork.point_3;

import java.util.HashSet;
import java.util.Set;

//Есть HashSet магазинов. У магазина есть название и ID. Создать несколько магазинов (через оператор new Shop(..))
// с одинаковым ID и названием и добавить их в ваш Set.
public class Main {
    public static void main(String[] args) {
        Set<Shop> shops= new HashSet<>();
        shops.add(new Shop("LV",4));
        shops.add(new Shop("YSL",2));
        shops.add(new Shop("Gucci",3));
        shops.add(new Shop("Shanel",4));
        shops.add(new Shop("LV",5));
        shops.add(new Shop("LV",4));
        shops.add(new Shop("YSL",2));
        shops.add(new Shop("Gucci",3));
        shops.add(new Shop("Shanel",4));
        shops.add(new Shop("LV",5));
        System.out.println(shops);
    }
}
