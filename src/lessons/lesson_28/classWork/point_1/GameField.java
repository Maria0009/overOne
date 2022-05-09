package lessons.lesson_28.classWork.point_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class GameField extends JPanel implements ActionListener {
    private final int SIZE = 320;//размер поля
    private final int DOT_SIZE = 16;//размер одного звена или яблока
    private final int ALL_DOTS = 400;//количество возможных точек

    private Image dot;//картинка звена змейки
    private Image apple;//картинка яблока

    private int[] x = new int[ALL_DOTS];//координаты змейки
    private int[] y = new int[ALL_DOTS];

    private int appleX;//координаты яблока
    private int appleY;
    private int appleX2;
    private int appleY2;
    private int counter = 0;

    private int dots;//количество звеньев в змейке
    private Timer timer;//таймер, который определяет частоту обновления

    private boolean left = false;//булевые переменные, которые показывают куда движется змейка
    private boolean right = true;
    private boolean up = false;
    private boolean down = false;

    private boolean inGame = true;//переменная которая показывает что мы еще не проиграли

    public void loadImage() {//подгружаем наши картинки
        ImageIcon iia = new ImageIcon("apple.png");
        apple = iia.getImage();
        ImageIcon iid = new ImageIcon("dot.png");
        dot = iid.getImage();
    }

    //Создание координат яблока
    public void createApple() {
        appleX = new Random().nextInt(20) * DOT_SIZE;
        appleY = new Random().nextInt(20) * DOT_SIZE;
        appleX2 = new Random().nextInt(20) * DOT_SIZE;
        appleY2 = new Random().nextInt(20) * DOT_SIZE;
    }

    public void createApple(int appleX, int appleY) {
        if (this.appleX == appleX && this.appleY == appleY) {
            this.appleX = new Random().nextInt(20) * DOT_SIZE;
            this.appleY = new Random().nextInt(20) * DOT_SIZE;
        } else {
            this.appleX2 = new Random().nextInt(20) * DOT_SIZE;
            this.appleY2 = new Random().nextInt(20) * DOT_SIZE;
        }
    }

    public void initGame() {//инициализируем нашу игру(только при старте)
        dots = 3;
        for (int i = 0; i < dots; i++) {
            y[i] = 48;
            x[i] = 48 - i * DOT_SIZE;
        }
        timer = new Timer(200, this);
        timer.start();
        createApple();
        Time time= new Time();
        time.start();
    }

    public GameField() {//прописываем свойства нашего экрана
        setBackground(Color.BLACK);
        loadImage();
        initGame();
        addKeyListener(new FieldKeyListener());
        setFocusable(true);
    }

    class Time extends Thread {
        private int seconds = 0;
        private int minutes = 0;
        private int hours = 0;

        public int getHours() {
            return hours;
        }

        public int getMinutes() {
            return minutes;
        }

        public int getSeconds() {
            return seconds;
        }

        @Override
        public void run() {
            while (true) {
                for (int k = 0; k < 60; k++) {
                    hours = k;
                    for (int j = 0; j < 60; j++) {
                        minutes = j;
                        for (int i = 0; i < 60; i++) {
                            seconds = i;
                            try {
                                sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }
    }

    class FieldKeyListener extends KeyAdapter {//метод который слушает наши кнопки
    @Override
    public void keyPressed(KeyEvent e) {
        super.keyPressed(e);
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT && !right) {
            left = true;
            up = false;
            down = false;
        }
        if (key == KeyEvent.VK_RIGHT && !left) {
            right = true;
            up = false;
            down = false;
        }
        if (key == KeyEvent.VK_UP && !down) {
            down = true;
            left = false;
            right = false;
        }
        if (key == KeyEvent.VK_DOWN && !up) {
            up = true;
            left = false;
            right = false;
        }
    }
}

public void move(){//определяем логику движения змейки
        for(int i=dots;i>0;i--){
        x[i]=x[i-1];
        y[i]=y[i-1];
        }
        if(left){
        x[0]-=DOT_SIZE;
        }
        if(right){
        x[0]+=DOT_SIZE;
        }
        if(up){
        y[0]+=DOT_SIZE;
        }
        if(down){
        y[0]-=DOT_SIZE;
        }
        }

public void checkCollision(){//проверяем ситуации, когда наша змейка в проигрыше
        for(int i=dots;i>0;i--){
        if(x[0]==x[i]&&y[0]==y[i]){
        inGame=false;
        }
        if(x[0]>SIZE){
        x[0]=x[SIZE];
        // inGame = false;
        }
        if(x[0]< 0){
        x[0]=SIZE;
        //inGame = false;
        }
        if(y[0]>SIZE){
        y[0]=y[SIZE];
        //  inGame = false;
        }
        if(y[0]< 0){
        y[0]=SIZE;
        //  inGame = false;
        }
        }
        }

public void checkApple(){//проверяем съела ли наша змейка яблоко
        if(x[0]==appleX&&y[0]==appleY){
        dots++;
        counter++;
        createApple(appleX,appleY);
        }
        if(x[0]==appleX2&&y[0]==appleY2){
        dots++;
        counter++;
        createApple(appleX2,appleY2);
        }
        }

@Override
protected void paintComponent(Graphics g){//отрисовываем яблоки и змейку
        Time time=new Time();
        time.start();
        super.paintComponent(g);
        if(inGame){
        g.drawImage(apple,appleX,appleY,this);
        g.drawImage(apple,appleX2,appleY2,this);
        g.drawString(String.valueOf(time.getSeconds()),20,30);
        g.drawString(String.valueOf(time.getMinutes()),20,30);
        g.setColor(Color.WHITE);
        for(int i=0;i<dots; i++){
        g.drawImage(dot,x[i],y[i],this);
        g.drawString(String.valueOf(counter),SIZE*31/32,25);
        }
        }else{
        String str="GAME OVER! :(";
        g.setColor(Color.WHITE);
        g.drawString(str,SIZE/2,SIZE/2);
        }
        }

@Override
public void actionPerformed(ActionEvent e){//метод который реагирует на наши изминения
        if(inGame){
        checkApple();
        checkCollision();
        move();
        }
        repaint();
        }
        }
