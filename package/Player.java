public class Player extends Entity{
    final int SPEED = 1;
    final int LIFE = 3;
    int score = 0;

    Player(double x,double y){
        super(x, y, 100, 20);
    }
    
    public void move(){
        if(Window.isKeyPressed[0]&&this.x>0)this.x-=this.SPEED;
        if(Window.isKeyPressed[1]&&this.x<Window.WIDTH)this.x+=SPEED;
    }
}
