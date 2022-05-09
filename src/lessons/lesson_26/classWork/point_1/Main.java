package lessons.lesson_26.classWork.point_1;

public class Main {
    public static void main(String[] args) {
        User user= new User("DDD", StateEnum.MAIN_SCREEN);
        if(user.getStateEnum().equals(StateEnum.MAIN_SCREEN)){

        }

        StateEnum stateEnum=StateEnum.MAIN_SCREEN;
        System.out.println(stateEnum.ordinal());
        System.out.println(stateEnum.name());
    }
}
