package lessons.lesson_19.classWork.point_3.sub_3;

public class Animal extends Main implements AnimalEat, AnimalTravel {
    public void eat() {
        System.out.println("Animal is eating");
    }

    public void travel() {
        System.out.println("Animal is travelling");
    }
}
