package no.simenbai.Chess.Game.Logic;

import no.simenbai.Chess.Game.Datatypes.Piece;

import static no.simenbai.Chess.Game.Datatypes.Piece.PieceColor.*;
import static no.simenbai.Chess.Game.Datatypes.Piece.PieceType.*;

public class Board {
    private static Piece[][] board;

    public void createBoard() {
        board = new Piece[8][8];
        cleanBoard();
    }

    public void resetBoard() {
        cleanBoard();
        //ROOK
        board[0][0] = new Piece(ROOK, BLACK);
        board[7][0] = new Piece(ROOK, BLACK);
        board[0][7] = new Piece(ROOK, WHITE);
        board[7][7] = new Piece(ROOK, WHITE);

        //Knight
        board[1][0] = new Piece(KNIGHT, BLACK);
        board[6][0] = new Piece(KNIGHT, BLACK);
        board[6][7] = new Piece(KNIGHT, WHITE);
        board[1][7] = new Piece(KNIGHT, WHITE);

        //Bishop
        board[2][0] = new Piece(BISHOP, BLACK);
        board[5][0] = new Piece(BISHOP, BLACK);
        board[5][7] = new Piece(BISHOP, WHITE);
        board[2][7] = new Piece(BISHOP, WHITE);

        //King
        board[3][0] = new Piece(KING, BLACK);
        board[4][7] = new Piece(KING, WHITE);

        //Queen
        board[4][0] = new Piece(QUEEN, BLACK);
        board[3][7] = new Piece(QUEEN, WHITE);

        //Pawn
        for (int i = 0; i < 8; i++) {
            board[i][1] = new Piece(PAWN, BLACK);
            board[i][6] = new Piece(PAWN, WHITE);
        }
    }

    public Piece[][] getBoard() {
        return board;
    }

    public void cleanBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = new Piece(Piece.PieceType.EMPTY, Piece.PieceColor.EMPTY);
            }
        }
    }
}
