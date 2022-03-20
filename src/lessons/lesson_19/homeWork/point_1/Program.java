package lessons.lesson_19.homeWork.point_1;
//Program is not a computer type:) You could create classes like - PC (PersonalComputer),Mac(Apple Macintosh),Notebook and ect
//But ok, good implementation!
public class Program implements Computer {

    private String turn;
    private String status;

    public Program(String turn, String status) {
        this.turn = turn;
        this.status = status;
    }

    @Override
    public String turnOn() {
        turn = "on";
        return turn;
    }

    @Override
    public String turnOff() {
        turn = "off";
        return turn;
    }

    @Override
    public String reset() {
        if (!status.equals("works good")) {
            turnOff();
            turnOn();
            status = "works good";
        } else {
            System.out.print("Don`t need reset: ");
        }
        return status;
    }

    public void turnOnOrTurnOff() {
        if (turn.equals("on")) {
            turnOff();
        } else {
            turnOn();
        }
    }

    public void printStatus() {
        System.out.println("Program " + turn
                + " and " + status);
    }
}
