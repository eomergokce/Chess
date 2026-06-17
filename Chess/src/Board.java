/*public class Board {

    Pieces[][] board = new Pieces[8][8];    // dikey,yatay

    public void resetBoard(){

        for(int i=0; i<8; i++){
            Pawn pawn = new Pawn("black");
            board[1][i] = pawn;
        }
        for(int i=0; i<8; i++){
            Pawn pawn = new Pawn("white");
            board[6][i] = pawn;
        }

        for(int i=0; i<3; i++){
            Pieces[] rowPieces = {new Rook("black"), new Knight("black"), new Bishop("black"),};
            board[0][i] = rowPieces[i];
            board[0][7-i] = rowPieces[i];
        }

        for(int i=0; i<3; i++){
            Pieces[] rowPiecesW = {new Rook("white"), new Knight("white"), new Bishop("white"),};
            board[7][i] = rowPiecesW[i];
            board[7][7-i] = rowPiecesW[i];
        }

        King king = new King("black");
        board[0][4] = king;
        Queen queen = new Queen("black");
        board[0][3] = queen;

        King kingW = new King("white");
        board[7][4] = kingW;
        Queen queenW = new Queen("white");
        board[7][3] = queenW;

    }
}
*/