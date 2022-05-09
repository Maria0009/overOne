package lessons.lesson_19.classWork.point_1;

public class ObjectMain {
    public static void main(String[] args) {
        //восходящее преобразование (от подкласса внизу к суперклассу вверху иерархии) или upcasting.
        // Такое преобразование осуществляется автоматически.
        Object tom = new Person("Tom");
        Object sam = new Employee("Sam", "Oracle");
//        sam.display
        Object kate = new Client("Kate", "DeutscheBank", 2000);
        Person bob = new Client("Bob", "DeutscheBank", 3000);
        Person alice = new Employee("Alice", "Google");

        // нисходящее преобразование от Object к типу Employee
        Employee emp = (Employee) sam;//В данном случае переменная sam приводится к типу Employee. И затем через объект emp мы можем обратиться к функционалу объекта Employee.
        emp.display();
        System.out.println(emp.getCompany());
    }
}
