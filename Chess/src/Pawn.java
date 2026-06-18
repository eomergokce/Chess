public class Pawn extends Pieces{

    public Pawn(String color, int x, int y){    //javada constructor miras alınmaz
        super(color, x, y);
    }

    @Override
    public boolean move(int newX, int newY, Pieces[][] board) {

        if(!super.move(newX, newY, board)){
            return false;
        }

        if(this.color == "white" && this.x == newX && this.y == 6 && (this.y-newY==1 || this.y-newY==2)) {
            this.y = newY;
            return true;
        }

        if(this.color == "white" && this.x == newX && this.y-newY==1) {
            this.y = newY;
            return true;
        }

        if(this.color == "black" && this.x == newX && this.y == 1 && (newY-this.y==1 || newY-this.y==2)) {
            this.y = newY;
            return true;
        }

        if(this.color == "black" && this.x == newX && newY-this.y==1) {
            this.y = newY;
            return true;
        }

        if(this.color == "white" && Math.abs(this.x - newX)==1 && this.y-newY==1){
            this.x = newX;
            this.y = newY;
            return true;
        }

        if(this.color == "black" && Math.abs(this.x - newX)==1 && newY-this.y==1){
            this.x = newX;
            this.y = newY;
            return true;
        }

        return false;
    }
}
