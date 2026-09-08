public class Pawn extends Pieces{

    public Pawn(Color color, int x, int y){    //javada constructor miras alınmaz
        super(PieceType.PAWN, color, x, y);
    }

    public boolean move(int newX, int newY, Pieces[][] board) {

        if(board[newX][newY] == null){

            if(this.x == newX){

                if(this.color==Color.WHITE){
                    if(this.y==6 && newY==4 && board[this.x][5]==null){
                        return true;
                    }
                    else if(this.y-newY==1){
                        return true;
                    }
                }

                else{
                    if(this.y==1 && newY==3 && board[this.x][2]==null){
                        return true;
                    }
                    else if(newY-this.y==1){
                        return true;
                    }
                }

            }
        }

        else{
            if(this.color==Color.WHITE && this.y-newY==1){
                if(Math.abs(newX-this.x)==1){
                    return true;
                }
            }
            else if(this.color==Color.BLACK && newY-this.y==1){
                if(Math.abs(newX-this.x)==1){
                    return true;
                }
            }
        }

        return false;
    }
}