package lessons.lesson_17.classWork.point_2;

public class Cat extends Animal {
    private int lifeAmount;

    Cat(int lifeAmount) {
        this.lifeAmount = lifeAmount;
    }

    Cat(int lifeAmount, int catWeight) {
        super(catWeight);
        this.lifeAmount = lifeAmount;
    }

    Cat() {
        this.lifeAmount = 9;
    }

    public int getLifeAmount() {
        return lifeAmount;
    }

    public void setLifeAmount(int lifeAmount) {
        this.lifeAmount = lifeAmount;
    }

    @Override
    public void voice() {
        System.out.println("Cat");
    }
}
