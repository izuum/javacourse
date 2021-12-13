package day17;

import static day17.ChessBoard.print;

public class Task2 {
    public static void main(String[] args) {
        String[][] chessLocation = new String[8][8];
        chessLocation[0][0] = ChessPiece.ROOK_BLACK.getName();
        for (int i = 1; i < 5; i++){
            chessLocation[0][i] = ChessPiece.EMPTY.getName();
        }
        chessLocation[0][5] = ChessPiece.ROOK_BLACK.getName();
        chessLocation[0][6] = ChessPiece.KING_BLACK.getName();
        chessLocation[0][7] = ChessPiece.EMPTY.getName();

        chessLocation[1][0] = ChessPiece.EMPTY.getName();
        chessLocation[1][1] = ChessPiece.ROOK_WHITE.getName();
        chessLocation[1][2] = ChessPiece.EMPTY.getName();
        chessLocation[1][3] = ChessPiece.EMPTY.getName();
        chessLocation[1][4] = ChessPiece.PAWN_BLACK.getName();
        chessLocation[1][5] = ChessPiece.PAWN_BLACK.getName();
        chessLocation[1][6] = ChessPiece.EMPTY.getName();
        chessLocation[1][7] = ChessPiece.PAWN_BLACK.getName();

        chessLocation[2][0] = ChessPiece.PAWN_BLACK.getName();
        chessLocation[2][1] = ChessPiece.EMPTY.getName();
        chessLocation[2][2] = ChessPiece.KNIGHT_BLACK.getName();
        chessLocation[2][3] = ChessPiece.EMPTY.getName();
        chessLocation[2][4] = ChessPiece.EMPTY.getName();
        chessLocation[2][5] = ChessPiece.EMPTY.getName();
        chessLocation[2][6] = ChessPiece.PAWN_BLACK.getName();
        chessLocation[2][7] = ChessPiece.EMPTY.getName();

        chessLocation[3][0] = ChessPiece.QUEEN_BLACK.getName();
        chessLocation[3][1] = ChessPiece.EMPTY.getName();
        chessLocation[3][2] = ChessPiece.EMPTY.getName();
        chessLocation[3][3] = ChessPiece.BISHOP_WHITE.getName();
        for (int i = 4; i < 8; i++){
            chessLocation[3][i] = ChessPiece.EMPTY.getName();
        }

        chessLocation[4][0] = ChessPiece.EMPTY.getName();
        chessLocation[4][1] = ChessPiece.EMPTY.getName();
        chessLocation[4][2] = ChessPiece.EMPTY.getName();
        chessLocation[4][3] = ChessPiece.BISHOP_BLACK.getName();
        chessLocation[4][4] = ChessPiece.PAWN_WHITE.getName();
        chessLocation[4][5] = ChessPiece.EMPTY.getName();
        chessLocation[4][6] = ChessPiece.EMPTY.getName();
        chessLocation[4][7] = ChessPiece.EMPTY.getName();

        for (int i = 0; i < 4; i++){
            chessLocation[5][i] = ChessPiece.EMPTY.getName();
        }
        chessLocation[5][4] = ChessPiece.BISHOP_WHITE.getName();
        chessLocation[5][5] = ChessPiece.PAWN_WHITE.getName();
        chessLocation[5][6] = ChessPiece.EMPTY.getName();
        chessLocation[5][7] = ChessPiece.EMPTY.getName();

        chessLocation[6][0] = ChessPiece.PAWN_WHITE.getName();
        chessLocation[6][1] = ChessPiece.EMPTY.getName();
        chessLocation[6][2] = ChessPiece.EMPTY.getName();
        chessLocation[6][3] = ChessPiece.QUEEN_WHITE.getName();
        chessLocation[6][4] = ChessPiece.EMPTY.getName();
        chessLocation[6][5] = ChessPiece.PAWN_WHITE.getName();
        chessLocation[6][6] = ChessPiece.EMPTY.getName();
        chessLocation[6][7] = ChessPiece.PAWN_WHITE.getName();

        for(int i = 0; i < 5; i++){
            chessLocation[7][i] = ChessPiece.EMPTY.getName();
        }
        chessLocation[7][5] = ChessPiece.ROOK_WHITE.getName();
        chessLocation[7][6] = ChessPiece.KING_WHITE.getName();
        chessLocation[7][7] = ChessPiece.EMPTY.getName();

        print(chessLocation);

    }
}
