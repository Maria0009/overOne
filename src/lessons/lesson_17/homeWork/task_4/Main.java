package lessons.lesson_17.homeWork.task_4;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle();
        Vehicle electricVehicle=new ElectricVehicle();
        Vehicle hybrid= new HybridVehicle();

        vehicle.start();
        vehicle.resource();
        electricVehicle.start();
        electricVehicle.resource();
        hybrid.start();
        hybrid.resource();
    }
}
