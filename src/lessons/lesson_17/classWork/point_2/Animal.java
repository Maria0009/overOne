package lessons.lesson_17.classWork.point_2;

//понятно, что животное обладает огромным количеством качеств/возможностей, но,
// например, в нашей задаче достаточно такого поля как вес и такого метода как "голос"
//ЭТО И ЕСТЬ ПРИМЕНЕНИЕ АБСТРАКЦИИ - мы абстрагировались и вычеркнули ненужное
public class Animal {
    private int weight;

    Animal(int animalWeight) {
        this.weight = animalWeight;
    }

    public Animal() {
    }

    public void voice() {
        System.out.println("voice");
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int animalWeight) {
        if (animalWeight > 0) {
            this.weight = animalWeight;
        } else {
            System.out.println("Weight can not be less than 0");
        }
    }
}
