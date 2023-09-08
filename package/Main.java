import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class Main{
    static Block blocks[][] = new Block[3][5];

    public static void main(String[] args) {
        Window win = new Window("Test");

        final int WIDTH = 80;
        final int HEIGHT = 100;
        for(int i = 0;i<blocks.length;i++){
            for(int j = 0;j<blocks[i].length;j++){
                blocks[i][j] = new Block(50+WIDTH*j, -10-HEIGHT*i, WIDTH, HEIGHT, 10);
            }
        }

        Timer timer = new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLoop();
                win.cv.repaint();
            }
        });

        timer.start();
    }

    public static void gameLoop(){
        //gameLoopの中身書いてね
        
    }
}
