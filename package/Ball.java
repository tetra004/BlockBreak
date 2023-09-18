public class Ball extends Entity {

    int radius;
    int vx;
    int vy;
    double lastX;
    double lastY;

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
        this.lastX = this.x;
        this.lastY = this.y;
        this.x += this.vx;
        this.y += this.vy;

        if((this.x+this.radius*2) >= Window.WIDTH || this.x <= 0){
            this.vx*=-1;
        }

        if(isHit(Main.player)){
            this.vy = -this.SPEED;
        }else if(this.y<0){
            this.vy = this.SPEED;
        }

        for(int i = 0; i < Main.blocks.length; i++){
            for(int j = 0; j < Main.blocks[0].length; j++){
                if(isHit(Main.blocks[i][j])){
                    if((Main.blocks[i][j].x-this.radius*2<=this.lastX && this.lastX<=Main.blocks[i][j].x+Main.blocks[i][j].width) && !(Main.blocks[i][j].y-this.radius*2<=this.lastY && this.lastY<=Main.blocks[i][j].y+Main.blocks[i][j].height)){
                        vy*=-1;
                        break;
                    }

                    if(!(Main.blocks[i][j].x-this.radius*2<=this.lastX && this.lastX<=Main.blocks[i][j].x+Main.blocks[i][j].width) && (Main.blocks[i][j].y-this.radius*2<=this.lastY && this.lastY<=Main.blocks[i][j].y+Main.blocks[i][j].height)){
                        vx*=-1;
                        break;
                    }

                    //if((Main.blocks[i][j].x-this.radius*2<=this.lastX && this.lastX<=Main.blocks[i][j].x+Main.blocks[i][j].width) && (Main.blocks[i][j].y-this.radius*2<=this.lastY && this.lastY<=Main.blocks[i][j].y+Main.blocks[i][j].height)){
                        vy*=-1;
                        vx*=-1;
                        break;
                    //}
                }

            }
        }

    }
}