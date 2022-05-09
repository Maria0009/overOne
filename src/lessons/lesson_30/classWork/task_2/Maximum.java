package lessons.lesson_30.classWork.task_2;

public class Maximum extends Thread {
    private int[] array;

    public Maximum(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        int counter = 0;
        for (int i = 1; i < array.length-1; i++) {
            if (array[i] > array[i+1] && array[i] > array[i-1]) {
                //System.out.println(array[i]);
                counter++;
            }
        }
        System.out.println(counter);
    }

}
    class Minimum extends Thread{
        private int[] array;

        public Minimum(int[] array) {
            this.array = array;
        }

        @Override
        public void run() {
            int min = 0;
            int counter = 0;
            for (int i = 1; i < array.length-1; i++) {
                if (array[i] < array[i+1] && array[i] < array[i-1]) {
                    //System.out.println(array[i]);
                    counter++;
                }
            }
            System.out.println(counter);
        }

    }
