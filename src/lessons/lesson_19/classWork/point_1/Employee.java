package lessons.lesson_19.classWork.point_1;

public class Employee extends Person {
    private String company;

    public Employee(String name, String company) {
        super(name);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public void display() {
        System.out.printf("Employee %s works in %s \n", super.getName(), company);
    }
}
