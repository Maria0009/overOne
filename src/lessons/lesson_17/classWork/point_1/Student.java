package lessons.lesson_17.classWork.point_1;

public class Student {
    String name;
    int courseNum;

    {
        name = "John";
        courseNum = 4;
//        displayInfo();
    }

    private void displayInfo() {
        System.out.println(name + " " + courseNum);
    }

    public void displayPublicInfo() {
        System.out.println(name + " " + courseNum);
    }
}