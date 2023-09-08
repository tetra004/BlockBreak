import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class Main{
    static Block blocks[][] = Block.generateArrays();

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
        
    }
}
