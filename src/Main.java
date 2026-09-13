import java.util.Scanner;

public class Main {
    static void main() {

        Scanner sc = new Scanner(System.in);
        Board board = new Board();

        board.resetBoard();
        board.printBoard();
        Color currentTurn = Color.WHITE;

        while(true){

            String square1 = sc.next();
            String square2 = sc.next();

            int[] i = board.coordinate(square1.charAt(0),square1.charAt(1));
            int[] j = board.coordinate(square2.charAt(0),square2.charAt(1));

            if(i==null || j==null){
                continue;
            }

            int x1 = i[0];
            int y1 = i[1];
            int x2 = j[0];
            int y2 = j[1];

            if(board.getPiece(x1, y1)==null || board.getPiece(x1, y1).color != currentTurn){
                continue;
            }

            boolean b = board.makeMove(x1, y1, x2, y2);
            board.printBoard();

            if(b){

                if(currentTurn == Color.BLACK){
                    currentTurn = Color.WHITE;
                }
                else{
                    currentTurn = Color.BLACK;
                }
            }

        }

    }
}