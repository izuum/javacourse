package day17;

public class ChessBoard {
    public ChessBoard(String[][] chessBoard){

    }
    public static void print(String[][] chessBoard){
        for(int i = 0; i < chessBoard.length; i++){
            for(int j = 0; j < chessBoard[i].length; j++){
                System.out.print(chessBoard[i][j]);
            }
            System.out.println();
        }
    }
}
