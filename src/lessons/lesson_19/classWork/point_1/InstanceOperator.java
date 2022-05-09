package lessons.lesson_19.classWork.point_1;

public class InstanceOperator {
    public static void main(String[] args) {
        String name = "James";
        boolean result = name instanceof String;// following will return true since name is type of String
        System.out.println(result);
        Vehicle vehicle = new Car();
        System.out.println(vehicle instanceof Vehicle);
    }
}
