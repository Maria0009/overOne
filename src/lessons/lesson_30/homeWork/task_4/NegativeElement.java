package lessons.lesson_30.homeWork.task_4;

public class NegativeElement extends Thread {
    private int[] array;

    public NegativeElement(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        int counterNegativeElements = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                counterNegativeElements++;
            }
        }
        System.out.println("Counter negative elements: " + counterNegativeElements);

    }

}
