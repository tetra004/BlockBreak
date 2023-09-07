import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class Main{

    public static void main(String[] args) {
        Window win = new Window("Test");

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
        Block block[][] = new Block[3][5];
        final int WIDTH = 80;
        final int HEIGHT = 100;
        for(int i = 0;i<block.length;i++){
            for(int j = 0;j<block[i].length;j++){
                block[i][j] = new Block(50+WIDTH*j, -10-HEIGHT*i, WIDTH, HEIGHT);
            }
        }
    }

}
