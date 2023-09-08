public class Block extends Entity{
    
    int score;
    static final int WIDTH = 80;
    static final int HEIGHT= 100;

    Block(double x,double y,int score){
        super(x, y, Block.WIDTH, Block.HEIGHT);
        score = this.score;
    }

    public static Block[][] generateArrays(){

        Block[][] blocks = new Block[3][5];

        for(int i = 0;i<blocks.length;i++){
            for(int j = 0;j<blocks[i].length;j++){
                blocks[i][j] = new Block(50+Block.WIDTH*j, -10-Block.HEIGHT*i , 10);
            }
        }

        return blocks;
    }
}
