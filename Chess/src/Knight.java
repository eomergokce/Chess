public class Knight extends Pieces{

    public Knight(Color color, int x, int y){
        super(PieceType.KNIGHT, color, x, y);
    }

    public boolean move(int newX, int newY, Pieces[][] board) {

        if(Math.abs(this.x-newX)==2 && Math.abs(this.y-newY)==1
                || Math.abs(this.y-newY)==2 && Math.abs(this.x-newX)==1) {
            return true;
        }

        return false;
    }
}