public class Bishop extends Pieces{

    public Bishop(Color color, int x, int y){
        super(PieceType.BISHOP, color, x, y);
    }

    @Override
    public boolean move(int newX, int newY, Pieces[][] board) {

        {
            int j=0;
            for(int i=1; i<Math.abs(this.x-newX); i++){ //ör. 2 adım atar ama 1 boş kareden geçer
                if(this.x>newX && this.y>newY){
                    if(board[this.x-i][this.y-i] == null){
                        j++;
                    }
                }
                if(this.x>newX && this.y<newY){
                    if(board[this.x-i][this.y+i] == null){
                        j++;
                    }
                }
                if(this.x<newX && this.y>newY){
                    if(board[this.x+i][this.y-i] == null){
                        j++;
                    }
                }
                if(this.x<newX && this.y<newY){
                    if(board[this.x+i][this.y+i] == null){
                        j++;
                    }
                }
            }

            if(j==Math.abs(this.x-newX)-1){
                return true;
            }
        }

        return false;
    }
}