import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class Main{
    static Block blocks[][] = Block.generateArrays();

    static Ball ball;
    static Player player;

    public static void main(String[] args) {
        ball = new Ball(10, 300, 10);
        player = new Player(250, 400);

        Window win = new Window("Test");

        Timer timer = new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(player.life!=0&&player.score<Block.SCORE*blocks.length*blocks[0].length)gameLoop();
                win.cv.repaint();
            }
        });

        timer.start();
    }

    public static void gameLoop(){
        //gameLoopの中身書いてね

        for(int i = 0;i<blocks.length;i++){
            for(int j = 0;j<blocks[0].length;j++){
                if(ball.isHit(blocks[i][j])){
                    player.score += Block.SCORE;
                    blocks[i][j] = null;
                    break;
                }
            }
        }

        ball.move();
        player.move();

        if(ball.y>Window.HEIGHT){
            player.life--;
            ball.x = 10;
            ball.y = 30;
        }

    }
}
