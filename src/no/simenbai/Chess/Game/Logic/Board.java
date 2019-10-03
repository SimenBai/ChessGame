package no.simenbai.Chess.Game.Logic;

import no.simenbai.Chess.Game.Enum.Pieces;

import java.util.ArrayList;
import java.util.Arrays;

public class Board {
    private static Pieces[][] board;

    public void createBoard() {
        board = new Pieces[8][8];
        cleanBoard();
        board[0][0] = Pieces.QUEEN;
        System.out.println(board[1][1]);
    }

    public void resetBoard() {
        cleanBoard();
        //ROOK
        board[0][0] = Pieces.ROOK;
        board[7][0] = Pieces.ROOK;
        board[7][7] = Pieces.ROOK;
        board[0][7] = Pieces.ROOK;

        //Knight
        board[1][0] = Pieces.KNIGHT;
        board[6][0] = Pieces.KNIGHT;
        board[6][7] = Pieces.KNIGHT;
        board[1][7] = Pieces.KNIGHT;

        //Bishop
        board[2][0] = Pieces.BISHOP;
        board[5][0] = Pieces.BISHOP;
        board[5][7] = Pieces.BISHOP;
        board[2][7] = Pieces.BISHOP;

        //King
        board[3][0] = Pieces.KING;
        board[4][7] = Pieces.KING;

        //Queen
        board[4][0] = Pieces.QUEEN;
        board[3][7] = Pieces.QUEEN;

        //Pawn
        for (int i = 0; i < 8; i++) {
            board[i][1] = Pieces.PAWN;
            board[i][6] = Pieces.PAWN;
        }
    }

    public Pieces[][] getBoard() {
        return board;
    }

    public void cleanBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = Pieces.EMPTY;
            }
        }
    }
}
