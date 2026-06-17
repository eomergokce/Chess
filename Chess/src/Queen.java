public class Queen extends Pieces{

    public Queen(String color, int x, int y){
        super(color, x, y);
    }

    @Override
    public boolean move(int newX, int newY, Pieces[][] board) {

        if(!super.move(newX, newY, board)){
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

        if(Math.abs(this.x-newX) == Math.abs(this.y-newY)) {
            this.y = newY;
            this.x = newX;
            return true;
        }

        return false;
    }

}
