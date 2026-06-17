public class Pieces {

    String color;
    int x;
    int y;

    public Pieces(String color, int x, int y){
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public boolean move(int newX, int newY, Pieces[][] board){

        if(newX<0 || newX>7 || newY<0 || newY>7){
            return false;
        }
        return true;
    }

}
