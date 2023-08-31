import javax.swing.JFrame;

public class Window extends JFrame{

    Canvas cv;

    Window(String name){

        this.setTitle(name);
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);

        this.cv = new Canvas(this.getWidth(), this.getHeight());
        this.add(this.cv);
    }
}
