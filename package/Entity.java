public abstract class Entity {
    
    /** (x,y)はエンティティの左上 */
    double x,y;
    int width,height;

    Entity(double x,double y,int width,int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
