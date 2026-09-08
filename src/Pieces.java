public abstract class Pieces {

    PieceType pieceType;
    Color color;
    int x;
    int y;

    public Pieces(PieceType pieceType, Color color, int x, int y){
        this.pieceType = pieceType;
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public char symbol(){

        char c = switch (this.pieceType) {
            case PAWN -> 'p';
            case KNIGHT -> 'n';
            case BISHOP -> 'b';
            case ROOK -> 'r';
            case QUEEN -> 'q';
            case KING -> 'k';
        };

        if(this.color==Color.WHITE){
            return Character.toUpperCase(c);
        }
        else{
            return c;
        }
    }

    public abstract boolean move(int newX, int newY, Pieces[][] board);

    public boolean pieceMove(int newX, int newY, Pieces[][] board){  //kural kitapçığı

        if(newX<0 || newX>7 || newY<0 || newY>7){
            return false;
        }
        if(board[newX][newY] != null && board[newX][newY].color == this.color){
            return false;
        }

        return true;
    }

    public void capture(int newX, int newY, Pieces[][] board){  //move onaylarsa hamle yapılır

        board[this.x][this.y]=null;
        this.x = newX;
        this.y = newY;
        board[newX][newY]=this;
    }

}