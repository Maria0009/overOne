package lessons.lesson_21.homeWork.point_1;

import java.util.ArrayList;
import java.util.List;

//Вход на вечеринку только по списку.
// Есть список имен (коллекция). Пользователь вводит с консоли свое имя, а программа проверяет его наличие в списке,
// после чего говорит может он пройти или нет
public class Main {
    public static void main(String[] args) {
        List<String> partyList = new ArrayList<>();
        partyList.add("Alex");
        partyList.add("Vasiliy");
        partyList.add("Petr");
        partyList.add("Olga");
        partyList.add("Kat");
        partyList.add("Ivan");
        partyList.add("Roman");
        partyList.add("Sofia");
        partyList.add("Miranda");
        System.out.println(partyList);
        Person person = new Person();
        person.getName();
        System.out.println(person.findPerson(partyList));
    }
}
