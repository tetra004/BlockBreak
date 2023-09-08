public class Block extends Entity{
    
    int score;

    Block(double x,double y,int score){
        super(x, y, 80, 100);
        score = this.score;
    }
    //ブロックの座標は左上
}
