package lessons.lesson_28.classWork.point_1;

import javax.swing.*;

public class MainWindow extends JFrame {
    public MainWindow() {
        setTitle("Unreal Snake");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(355, 375);
        setLocation(400, 400);
        add(new GameField());
        setVisible(true);
    }

    public static void main(String[] args) {
        MainWindow mainWindow = new MainWindow();
    }
}

