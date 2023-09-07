public class Player extends Entity{
    
    final int SPEED = 1;

    Player(double x,double y,int width, int height){
        super(x, y, width, height);
    }
    
    public void move(){
        if(Window.isKeyPressed[0]&&this.x>0)this.x-=this.SPEED;
        if(Window.isKeyPressed[1]&&this.x<Window.WIDTH)this.x+=SPEED;
    }
}
