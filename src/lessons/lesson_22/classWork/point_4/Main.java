package lessons.lesson_22.classWork.point_4;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Создать класс «Сотрудник» в нем проинициализировать поля фамилия и отдел. Пометисть это все в мапу
//Вводим имя и по нему получаем отдел
public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Vasiliyev", "Department 1");
        Employee employee2 = new Employee("Sidorov", "Department 2");
        Employee employee3 = new Employee("Ivanov", "Department 3");
        Map<String, String> employeeMap = new HashMap<>();

        employeeMap.put(employee1.getLastName(), employee1.getDepartment());
        employeeMap.put(employee2.getLastName(), employee2.getDepartment());
        employeeMap.put(employee3.getLastName(), employee3.getDepartment());
        System.out.println(employeeMap);
        String lastName = findLastName();
        for (Map.Entry<String, String> entry : employeeMap.entrySet()) {
            String key = entry.getKey();
            if (lastName.equals(key)) {
                System.out.println(entry);
            }
        }
    }

    public static String findLastName() {
        System.out.println("Enter animal Name");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
