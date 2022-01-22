//Напишите программу печати таблицы перевода расстояний из дюймов в сантиметры
//для значений длин от 1 до 20 дюймов. 1дюйм= 2,54 см
package lessons.lesson_5.homeWork;

public class task_3 {
    public static void main(String[] args) {
        double cm = 2.54;
        double distance;
        //20 - magic number, use const or like cm
        for (int i = 1; i <= 20; i++) {
            distance = cm * i;
            System.out.println(i + " inch = " + distance + " cm");
        }
    }
}
