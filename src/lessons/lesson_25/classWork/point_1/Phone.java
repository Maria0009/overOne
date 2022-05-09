package lessons.lesson_25.classWork.point_1;

import java.util.Objects;

public class Phone {
    private int number;
    private int weight;
    private String model;

    public Phone(int number, int weight, String model) {
        this.number = number;
        this.weight = weight;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", weight=" + weight +
                ", model=" + model +
                '}';
    }

    public int getNumber() {
        return number;
    }

    public String receiveCall(Phone phone) {
        return "Subscriber " + this.number + " calls " + phone.getNumber();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return number == phone.number && weight == phone.weight && Objects.equals(model, phone.model);
    }

    public String sendMessage(Phone phone) {
        return "Subscriber with " + this.number + " and model " + this.model + " send message " + phone.getNumber();
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, weight, model);
    }
}
