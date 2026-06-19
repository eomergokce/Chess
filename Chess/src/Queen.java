public class Queen extends Pieces{

    public Queen(String color, int x, int y){
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
            if(this.y==newY){
                for(int i=1; i<Math.abs(this.x-newX); i++){
                    if(this.x>newX){
                        if(board[this.x-i][this.y] == null){
                            j++;
                        }
                    }
                    if(this.x<newX){
                        if(board[this.x+i][this.y] == null){
                            j++;
                        }
                    }
                }
                if(j!=Math.abs(this.x-newX)-1){
                    return false;
                }
            }
        }

        {
            int j=0;
            if(this.x==newX){
                for(int i=1; i<Math.abs(this.y-newY); i++){
                    if(this.y>newY){
                        if(board[this.x][this.y-i] == null){
                            j++;
                        }
                    }
                    if(this.y<newY){
                        if(board[this.x][this.y+i] == null){
                            j++;
                        }
                    }
                }
                if(j!=Math.abs(this.y-newY)-1){
                    return false;
                }
            }
        }

        {
            int j=0;
            if(Math.abs(this.x-newX) == Math.abs(this.y-newY)) {
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
        }

        if(this.x == newX){
            this.y = newY;
            return true;
        }

        if(this.y == newY){
            this.x = newX;
            return true;
        }

        if(Math.abs(this.x-newX) == Math.abs(this.y-newY)) {
            this.y = newY;
            this.x = newX;
            return true;
        }

        return false;
    }

}
