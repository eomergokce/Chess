public class Bishop extends Pieces{

    public Bishop(String color, int x, int y){
        super(color, x, y);
    }

    @Override
    public boolean move(int newX, int newY, Pieces[][] board) {

        if(!super.move(newX, newY, board)){
            return false;
        }

        if(board[newX][newY] != null && board[newX][newY].color == this.color){
            return false;
        }

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
            if(j!=Math.abs(this.x-newX)-1){
                return false;
            }
        }

        if(Math.abs(this.x-newX) == Math.abs(this.y-newY)) {    //dikey yatay aynı miktar ilerledi
            this.y = newY;
            this.x = newX;
            return true;
        }

        return false;
    }
}
