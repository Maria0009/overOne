package lessons.lesson_19.homeWork.point_2;

public class Catalog1 {
    private int count;
    private Home[] homes;

    public Catalog1() {
        homes = new Home[20];
        this.count = 0;
    }

    public void add(Home home) {//добавляет
        homes[count++] = home;
    }

    public void outCatalog1() {
        int index = 0;
        int list = 1;
        String name = homes[index].getClass().getSimpleName();
        while (list <= 2) {
            System.out.println(name + ": ");
            for (int i = 1; i < count; ++i) {
                if (homes[i].getClass().getSimpleName().equals(name)) {
                    System.out.println("Number of floor: " + homes[i].getNumberFloors());
                    System.out.println(homes[i].getHeating());
                    System.out.println("Number of people: " + homes[i].getNumberPeople());
                    System.out.println();
                } else {
                    index = i;
                    continue;
                }
            }
            System.out.println();
            list++;
            name = homes[index].getClass().getSimpleName();
        }
    }
}
