package lessons.lesson_21.homeWork.point_1;

import java.util.List;
import java.util.Scanner;

public class Person {
    private final String name;

    public Person() {
        this.name = enteredName();
    }

    public String getName() {
        return name;
    }

    public String findPerson(List partyList) {
        for (Object nameList : partyList) {
            if (name.equals(nameList)) {
                return "You can go in!";
            }
        }
        return "You can NOT go in!";
    }

    public static String enteredName() {
        System.out.println("Enter name: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
