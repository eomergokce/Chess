public class King extends Pieces{

    public King(Color color, int x, int y){
        super(PieceType.KING, color, x, y);
    }

    public boolean move(int newX, int newY, Pieces[][] board) {

        if(Math.abs(this.x-newX)<=1 && Math.abs(this.y-newY)<=1) {
            return true;
        }

        return false;
    }
}