package lessons.lesson_17.homeWork.task_4;

//Electric and Hybrid унаследованы от Vehicle. Реализовать метод resource() в наследованных классах.
public class HybridVehicle extends Vehicle{
    public void start(){
        System.out.println("Starting!");
    }
    public void resource(){
        System.out.println("I use both petrol and electricity!");
    }
}
