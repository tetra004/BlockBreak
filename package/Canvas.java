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
        g.fillOval(100,100, 50, 50);
    }
}
