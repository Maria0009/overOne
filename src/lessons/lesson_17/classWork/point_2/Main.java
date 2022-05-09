package lessons.lesson_17.classWork.point_2;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(22);
        //вес не может быть отрицательный.
        // Сейчас это ни на что не повлият, но в каких-то сложных приложениях, где могут быть какие-то расчеты,
        //это может привести к различного рода серьезным ошибкам
        //для этого "вмешательства" и существует инкапсуляция
        int weight = animal.getWeight();
        System.out.println("weight 1 = " + weight);
        animal.setWeight(25);
        System.out.println("weight 2 = " + animal.getWeight());

        //наследование
        Cat cat = new Cat(9, 22);
        System.out.println("cat weight = " + cat.getWeight());
        Dog dog = new Dog();
        dog.setWeight(33);
        System.out.println("Dog weight = " + dog.getWeight());
//        //полиморфизм
        animal.voice();//вызвали метод животного
//        //подменяем реализацию
        Animal animal1 = new Cat();
        Animal animal2 = createObject();
        animal2.voice();
        Animal animal3 = new Dog();
        animal3.voice();
        Animal animal4 = new Fish();
        animal4.voice();

//        Dog dog1 = new Dog();
//        dog1.voice();
//        dog1.voiceDog();
    }

    public static Animal createObject() {
        return new Cat();
    }
}