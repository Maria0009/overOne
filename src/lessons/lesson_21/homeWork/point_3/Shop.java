package lessons.lesson_21.homeWork.point_3;

//Есть HashSet магазинов. У магазина есть название и ID. Создать несколько магазинов (через оператор new Shop(..))
// с одинаковым ID и названием и добавить их в ваш Set.
public class Shop {
    private String name;
    private int id;

    public Shop(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ShopName: '" + name + '\'' +
                " id=" + id;
    }
}
