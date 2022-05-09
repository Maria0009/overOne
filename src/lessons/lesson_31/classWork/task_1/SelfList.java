package lessons.lesson_31.classWork.task_1;

public class SelfList<T>{
    private T[] list;
    private int size;
    private int actualSize = 0;

    public SelfList(T[] list) {
        this.list = list;
        actualSize = list.length;
        size = list.length;
    }

    public SelfList() {
        this.list = (T[]) new Object[0];
    }
    public T[] getList() {
        return list;
    }

    public void add(T el){
        T[] srr;
        srr = list.clone();

        this.list = (T[]) new Object[srr.length+1];
        for (int i = 0; i < srr.length; i++) {
            this.list[i] = srr[i];
        }
        this.list[list.length-1] = el;
    }
}

