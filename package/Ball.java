public class Ball extends Entity {

    int radius;
    int vx;
    int vy;

    final int SPEED = 2;

    public Ball(double x,double y,int radius){
        super(x,y,radius*2,radius*2);
        this.radius = radius;
        
        this.vx= SPEED;
        this.vy=-SPEED;
    }

    public boolean isHit(Entity target){

        if(target==null)return false;
        
        double xc = this.x + this.radius;
        double yc = this.y + this.radius;
        if((target.x-this.radius < xc && xc < target.x+target.width+this.radius) && (target.y-this.radius < yc && yc < target.y+target.height+this.radius)){
            return true;
        }
        return false;
    }

    public void move(){
        this.x += this.vx;
        this.y += this.vy;

        if((this.x+this.radius*2) >= Window.WIDTH || this.x <= 0){
            this.vx*=-1;
        }

        if(isHit(Main.player) || this.y<0){
            this.vy *= -1;
        }

        for(int i = 0; i < Main.blocks.length; i++){
            for(int j = 0; j < Main.blocks[0].length; j++){
                if(isHit(Main.blocks[i][j])){
                    //todo:側面の場合と正面の場合で場合分けする
                    
                    vy*=-1;
                    break;
                }

            }
        }

    }
}