package lessons.lesson_31.classWork.task_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3};
        SelfList<Integer> selfList = new SelfList<>();
        System.out.println(Arrays.toString(selfList.getList()));
        synchronized (arr){

        }
    }
}
