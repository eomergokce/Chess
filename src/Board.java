public class Board {

    Pieces[][] board = new Pieces[8][8];

    public boolean makeMove(int x, int y, int newX, int newY){

        if(board[x][y]==null){
            return false;
        }
        if(board[x][y].pieceMove(newX, newY, board)){
                board[x][y].capture(newX, newY, board);
                return true;
        }

        return false;
    }

    public int[] coordinate(char m, char n){

        int locX = switch (m) {
            case 'a' -> 0;
            case 'b' -> 1;
            case 'c' -> 2;
            case 'd' -> 3;
            case 'e' -> 4;
            case 'f' -> 5;
            case 'g' -> 6;
            case 'h' -> 7;
            default -> -1;
        };
        int i = n-'0';
        int locY = 8-i;

        if(locX==-1 || locY<0 ||locY>7){
            return null;
        }

        return new int[] {locX, locY};
    }

    public Pieces getPiece(int x, int y){
        return board[x][y];
    }

    public void resetBoard(){

        for(int i=0; i<8; i++){
            Pawn pawn = new Pawn(Color.BLACK, i, 1);
            board[i][1] = pawn;
        }
        for(int i=0; i<8; i++){
            Pawn pawn = new Pawn(Color.WHITE, i, 6);
            board[i][6] = pawn;
        }

        int k=0;
        for(int i=0; i<2; i++){

            int rookX = Math.abs(-k);
            int knightX = Math.abs(1-k);
            int bishopX = Math.abs(2-k);

            board[rookX][0] = new Rook(Color.BLACK, rookX, 0);
            board[knightX][0] = new Knight(Color.BLACK, knightX, 0);
            board[bishopX][0] = new Bishop(Color.BLACK, bishopX, 0);

            board[rookX][7] = new Rook(Color.WHITE, rookX, 7);
            board[knightX][7] = new Knight(Color.WHITE, knightX, 7);
            board[bishopX][7] = new Bishop(Color.WHITE, bishopX, 7);

            k=7-k;
        }

        board[3][0] = new Queen(Color.BLACK, 3, 0);
        board[4][0] = new King(Color.BLACK, 4, 0);

        board[3][7] = new Queen(Color.WHITE, 3, 7);
        board[4][7] = new King(Color.WHITE, 4, 7);

    }

    public void printBoard(){

        for(int i=0; i<8; i++){

            System.out.print(8-i);
            for(int j=0; j<8; j++){

                if(board[j][i]!=null){
                    System.out.print("  " + board[j][i].symbol());
                }
                else{
                    System.out.print("  .");
                }
            }
            System.out.println();
        }

        System.out.print("   a  b  c  d  e  f  g  h");
    }
}