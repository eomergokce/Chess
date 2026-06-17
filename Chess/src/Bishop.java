public class Bishop extends Pieces{

    public Bishop(String color, int x, int y){
        super(color, x, y);
    }

    @Override
    public boolean move(int newX, int newY, Pieces[][] board) {

        if(!super.move(newX, newY, board)){
            return false;
        }

        if(Math.abs(this.x-newX) == Math.abs(this.y-newY)) {    //dikey yatay aynı miktar ilerledi
            this.y = newY;
            this.x = newX;
            return true;
        }

        return false;
    }
}
