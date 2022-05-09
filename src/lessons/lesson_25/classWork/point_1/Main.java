package lessons.lesson_25.classWork.point_1;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone(6666, 50, "Huawei");
        Phone phone2 = new Phone(7777, 54, "Apple");
        Phone phone3 = new Phone(5555, 54, "Apple");
        Phone phone4 = new Phone(8888, 50, "Huawei");
        System.out.println(phone1.receiveCall(phone2));
        System.out.println(phone1.receiveCall(phone3));
        System.out.println(phone1.receiveCall(phone4));
        if (phone1.equals(phone2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println(phone1.sendMessage(phone2));
    }
}
