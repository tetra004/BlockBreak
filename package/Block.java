public class Block extends Entity{
    
    int score;
    static final int WIDTH = 80;
    static final int HEIGHT= 10;

    Block(double x,double y,int score){
        super(x, y, Block.WIDTH, Block.HEIGHT);
        this.score = score;
    }

    public static Block[][] generateArrays(){

        Block[][] blocks = new Block[3][5];

        for(int i = 0;i<blocks.length;i++){
            for(int j = 0;j<blocks[0].length;j++){
                blocks[i][j] = new Block(50+(Block.WIDTH+1)*j, 10+(Block.HEIGHT+1)*i , 10);
            }
        }

        return blocks;
    }
}
