public class Rook extends Pieces{

    public Rook(String color, int x, int y){
        super(color, x, y);
    }

    @Override
    public boolean move(int newX, int newY, Pieces[][] board) {

        if(!super.move(newX, newY, board)){     //tahta sınırı
            return false;
        }

        if(this.x == newX){
            this.y = newY;
            return true;
        }

        if(this.y == newY){
            this.x = newX;
            return true;
        }

        return false;
    }
}
