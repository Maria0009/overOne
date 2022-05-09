package lessons.lesson_26.classWork.point_2;

public class Main {
    public static void main(String[] args) {
        StateEnum stateEnum= StateEnum.EURO;
        System.out.println(stateEnum.currency);
        System.out.println(stateEnum.name());
        System.out.println(stateEnum.ordinal());
    }
}
