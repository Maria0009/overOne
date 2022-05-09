package lessons.lesson_25.classWork.point_2;

import java.util.Scanner;

public class Reader {
    private String name;
    private String lastName;
    private int age;
    private String address;


    public Reader(String name, String lastName, String address, int age) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.age = age;
    }

    public void setAge() {
        System.out.println("Enter age:");
        this.age = enterAge();
    }

    public void setName() {
        System.out.println("Enter name:");
        this.name = enter();
    }

    public Reader() {

    }

    public void setLastName() {
        System.out.println("Enter lastName:");
        this.lastName = enter();
    }

    public void setAddress() {
        System.out.println("Enter address:");
        this.address = enter();
    }

    public static String enter() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static int enterAge() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
