import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Window extends JFrame{

    /** [0]:A [1]:D */
    public static boolean[] isKeyPressed = {false,false};

    Canvas cv;

    static final int WIDTH  = 500;
    static final int HEIGHT = 500;

    Window(String name){

        this.setTitle(name);
        this.setSize(Window.WIDTH,Window.HEIGHT);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);

        this.cv = new Canvas(Window.WIDTH,Window.HEIGHT);
        this.add(this.cv);

        this.addKeyListener(new KeyListener(){

            @Override
            public void keyTyped(KeyEvent e) {}

            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case 'A':
                        isKeyPressed[0]=true;
                        break;
                    case 'D':
                        isKeyPressed[1]=true;
                        break;
                    default:
                        break;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case 'A':
                        isKeyPressed[0]=false;
                        break;
                    case 'D':
                        isKeyPressed[1]=false;
                        break;
                    default:
                        break;
                }
            }
            
        });
    }
}
