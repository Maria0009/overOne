package lessons.lesson_30.homeWork.task_4;

public class PositiveElement extends Thread {
    public int[] array;

    public PositiveElement(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        int counterPositiveElements = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                counterPositiveElements++;
            }
        }
        System.out.println("Counter positive elements: " + counterPositiveElements);
    }
}
