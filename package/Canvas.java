import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

public class Canvas extends JPanel{
    
    Canvas(int width,int height){
        this.setSize(width, height);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D gra=(Graphics2D)g;

        //図形や線のアンチエイリアシングの有効化
		gra.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
 
		//文字描画のアンチエイリアシングの有効化
		gra.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        draw(g);
    }

    public void draw(Graphics g){
        g.setColor(Color.cyan);
        for(int i=0;i<Main.blocks.length;i++){
            for (int j = 0; j < Main.blocks[0].length; j++) {
                if(Main.blocks[i][j]==null)continue;
                g.fillRect((int)Main.blocks[i][j].x, (int)Main.blocks[i][j].y, Main.blocks[i][j].width, Main.blocks[i][j].height);
            }
        }

        g.setColor(Color.blue);
        g.fillOval((int)Main.ball.x, (int)Main.ball.y, Main.ball.radius*2, Main.ball.radius*2);

        g.setColor(Color.red);
        g.fillRect((int)Main.player.x, (int)Main.player.y, Main.player.width, Main.player.height);

        g.setColor(Color.black);
        g.drawString("score/"+Main.player.score, 10, 10);
        g.drawString("life/"+Main.player.life, 10, 25);

    }
}
