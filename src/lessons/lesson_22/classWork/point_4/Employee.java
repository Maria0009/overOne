package lessons.lesson_22.classWork.point_4;

public class Employee {
    private String lastName;
    private String Department;

    public Employee(String lastName, String department) {
        this.lastName = lastName;
        Department = department;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return Department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "lastName='" + lastName + '\'' +
                ", Department='" + Department + '\'' +
                '}';
    }
}
