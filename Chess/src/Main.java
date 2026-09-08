public class Main {
    static void main() {

        Board board = new Board();
        Pieces pieces = new Pawn(Color.WHITE,5,6);

        board.resetBoard();
        board.printBoard();

        /*if(pieces.pieceMove(5,5, board.board)){
            if(pieces.move(5,5, board.board)){
                pieces.capture(5,5, board.board);
                board.printBoard();

            }
        }

        board.printBoard();*/
    }
}