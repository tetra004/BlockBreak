public class Ball extends Entity {
    int radius;
    public Ball(double x,double y,int radius){
        super(x,y,radius*2,radius*2);
        this.radius = radius;
    }
    public boolean isHit(Entity target){
        // double x1;
        // double x2;
        // double y1;
        // double y2;

        // double l = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        // if(l - r1 - r2 <= 0){
        //     return true;
        // }else{
        //     return false;
        // }
        
        double xc = this.x + this.radius;
        double yc = this.y + this.radius;
        if((target.x-this.radius <= xc && xc <= target.x+target.width+this.radius) && (target.y-this.radius <= yc && yc <= target.y+target.height+this.radius)){
            return true;
        }
        return false;
    }
}