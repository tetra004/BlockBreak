public class Block extends Entity{
    
    static final int SCORE = 10;
    static final int WIDTH = 80;
    static final int HEIGHT= 10;

    Block(double x,double y){
        super(x, y, Block.WIDTH, Block.HEIGHT);
    }

    public static Block[][] generateArrays(){

        Block[][] blocks = new Block[3][5];

        for(int i = 0;i<blocks.length;i++){
            for(int j = 0;j<blocks[0].length;j++){
                blocks[i][j] = new Block(50+(Block.WIDTH+1)*j, 10+(Block.HEIGHT+1)*i);
            }
        }

        return blocks;
    }
}
