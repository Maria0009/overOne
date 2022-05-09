package lessons.lesson_20.classWork.point_2;

//Есть два типа домов - городская многоэтажка и загородный дом.
// У каждого типа дома есть методы "получить кол-во этажей", "включить отопление", "получить кол-во жильцов".
// Есть каталог домов (например класс, внутри которого какой-то массив).
// Создайте каталог и поместите туда несколько домов.
public abstract class Home {
    private int amountFloor;
    private int amountPeople;
    private boolean heating;

    public Home(int amountFloor, int amountPeople, boolean heating){
        this.amountFloor=amountFloor;
        this.amountPeople=amountPeople;
        this.heating=heating;
    }
    public int getAmountFloor() {
        return amountFloor;
    }
    public int getAmountPeople() {
        return amountPeople;
    }

    public String getHeating() {
        if (heating) {
            return "Heating is turn on!";
        } else {
            return "Heating is turn off!";
        }
    }
}
