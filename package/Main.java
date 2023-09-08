import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class Main{
    static Block blocks[][] = Block.generateArrays();

    static Ball ball;
    static Player player;

    public static void main(String[] args) {
        ball = new Ball(10, -300, 5);
        player = new Player(250, -400);

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

        for(int i = 0;i<blocks.length;i++){
            for(int j = 0;j<blocks[i].length;j++){
                if(ball.isHit(blocks[i][j])){
                    player.score = blocks[i][j].score;
                    blocks[i][j] = null;
                }
            }
        }

        if(ball.y<Window.HEIGHT){
            player.life--;
            ball.x = 10;
            ball.y = -300;
            if(player.life==0){}
        }

    }
}
