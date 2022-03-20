package lessons.lesson_19.homeWork.point_2;

public class Main {
    public static void main(String[] args) {
        Catalog catalog=new Catalog();
        catalog.add(new TownHome(25,"on",56));
        catalog.add(new VillageHome(2,"off",2));
        catalog.add(new TownHome(15,"on",100));
        catalog.add(new TownHome(20,"off",206));
        catalog.add(new VillageHome(1,"off",5));
        catalog.add(new TownHome(21,"on",226));
        catalog.add(new TownHome(11,"on",150));
        catalog.add(new VillageHome(1,"off",4));
        catalog.add(new TownHome(25,"on",300));
        catalog.outCatalog();
    }
}
