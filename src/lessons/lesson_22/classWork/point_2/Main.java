package lessons.lesson_22.classWork.point_2;

import java.util.HashMap;
import java.util.Map;

//Создать класс Car
public class Main {
    public static void main(String[] args) {
        Car audi = new Car(230, 2000, "A4");
        Car toyota = new Car(230, 2000, "A4");
        Car mercedes = new Car(230, 2000, "A4");
        Map<Integer, Car> carMap = new HashMap<>();
        carMap.put(1, audi);
        carMap.put(2, toyota);
        carMap.put(3, mercedes);
        System.out.println(carMap);
        System.out.println();
    }
}
