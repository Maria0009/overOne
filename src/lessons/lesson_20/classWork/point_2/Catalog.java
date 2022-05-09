package lessons.lesson_20.classWork.point_2;

public class Catalog {
    private Home[] homes;
    private int counter;

    public Catalog() {
        homes = new Home[5];
        counter = 0;
    }

    public void addHome(Home home) {
        homes[counter++] = home;
    }

    public void outCatalog() {
        for (int i = 0; i < counter; ++i) {
            System.out.println(homes[i].getClass().getSimpleName());
            System.out.println("Number of floor: " + homes[i].getAmountFloor());
            System.out.println(homes[i].getHeating());
            System.out.println("Number of people: " + homes[i].getAmountPeople());
            System.out.println();
        }
    }

}
