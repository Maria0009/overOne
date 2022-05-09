package lessons.lesson_30.homeWork.task_3;

//создать массив и выводить в первом потоке четные элементы,
//во втором нечетные(по индексу). Интервал полсекунды
public class First extends Thread {
    private int[] array;

    public First(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        for (int i = 0; i < array.length; i += 2) {
            System.out.println(array[i]);
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
