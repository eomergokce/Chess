public class King extends Pieces{

    public King(String color, int x, int y){
        super(color, x, y);
    }

    @Override
    public boolean move(int newX, int newY, Pieces[][] board) {

        if(!super.move(newX, newY, board)){
            return false;
        }

        if(Math.abs(this.x-newX)==1 && Math.abs(this.y-newY)==1
            || this.x==newX && Math.abs(this.y-newY)==1
            || this.y==newY && Math.abs(this.x-newX)==1) {
            this.y = newY;
            this.x = newX;
            return true;
        }

        return false;
    }
}
