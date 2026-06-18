public class Knight extends Pieces{

    public Knight(String color, int x, int y){
        super(color, x, y);
    }

    @Override
    public boolean move(int newX, int newY, Pieces[][] board) {

        if(!super.move(newX, newY, board)){
            return false;
        }

        if(Math.abs(this.x-newX)==2 && Math.abs(this.y-newY)==1
            || Math.abs(this.y-newY)==2 && Math.abs(this.x-newX)==1) {
            this.y = newY;
            this.x = newX;
            return true;
        }

        return false;
    }
}
