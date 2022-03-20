package lessons.lesson_19.homeWork.point_2;

public abstract class Home {

    private int numberFloors;
    //maybe it can be boolean?
    private String heating;
    private int numberPeople;


    public Home(int numberOfFloors, String heating, int numberOfPeople) {
        this.numberFloors = numberOfFloors;
        this.heating = heating;
        this.numberPeople = numberOfPeople;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public String getHeating() {
        if (heating.equals("on")) {
            return "Heating is turn on!";
        } else {
            return "Heating is turn off!";
        }
    }

    public int getNumberPeople() {
        return numberPeople;
    }
}
