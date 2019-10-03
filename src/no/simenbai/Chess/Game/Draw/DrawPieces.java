package no.simenbai.Chess.Game.Draw;

import no.simenbai.Chess.Game.Enum.Pieces;
import no.simenbai.Chess.Game.Logic.Board;

import javax.swing.*;
import java.awt.*;

import static no.simenbai.Chess.Game.Main.CANVAS_MARGIN;
import static no.simenbai.Chess.Game.Main.CANVAS_SIZE;

public class DrawPieces extends JPanel {
    void drawPieces(Graphics g){
        Pieces[][] board = new Board().getBoard();
        for (int x = 0; x < 8; x++) {
            int sizeOfBoard = (CANVAS_SIZE- (2*CANVAS_MARGIN));
            int sizeOfSquare = sizeOfBoard/8;
            int offset = sizeOfSquare / 2;
            int spacingX = CANVAS_MARGIN + offset + sizeOfSquare*x;

            for (int y = 0; y < 8; y++) {
                int spacingY = CANVAS_MARGIN + offset + sizeOfSquare*y;
                g.drawString(board[x][y].toString(), spacingX, spacingY);
            }
        }
    }
}
