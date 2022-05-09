package lessons.lesson_26.classWork.point_1;

public class User {

    private String name;
    private StateEnum stateEnum;

    public User(String name, StateEnum stateEnum) {
        this.name = name;
        this.stateEnum = stateEnum;
    }

    public String getName() {
        return name;
    }

    public StateEnum getStateEnum() {
        return stateEnum;
    }
}
