package lessons.lesson_21.homeWork.point_4;

import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;

//Есть TreeSet имен, необходимо выбрать все от "H" до "W”
//(есть 2 способа: 1 – через использование 1 метода, а 2 – просто перебирая. Выбирайте по душе )
public class Main {
    public static void main(String[] args) {
        Set<String> names = new TreeSet<>();
        names.add("Alex");
        names.add("Vasiliy");
        names.add("Boris");
        names.add("Petr");
        names.add("Olga");
        names.add("Gorge");
        names.add("Kat");
        names.add("Ivan");
        names.add("Roman");
        names.add("Sofia");
        names.add("Miranda");
        System.out.println(names);
        findPerson(names);
    }

    public static void findPerson(Set<String> name) {
        boolean foundName;
        for (String nameList : name) {
            foundName = Pattern.matches("(^[H-W].*)", nameList);
            if (foundName) {
                System.out.println(nameList);
            }
        }
    }
}
