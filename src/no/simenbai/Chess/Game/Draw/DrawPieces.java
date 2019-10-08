package no.simenbai.Chess.Game.Draw;

import no.simenbai.Chess.Game.Datatypes.Piece;
import no.simenbai.Chess.Game.Logic.Board;
import no.simenbai.Chess.Game.Logic.ImageManipulation;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.nio.Buffer;

import static no.simenbai.Chess.Game.Main.CANVAS_MARGIN;
import static no.simenbai.Chess.Game.Main.CANVAS_SIZE;

public class DrawPieces extends JPanel {
    void drawPieces(Graphics g) {
        Piece[][] board = new Board().getBoard();
        for (int x = 0; x < 8; x++) {
            int sizeOfBoard = (CANVAS_SIZE - (2 * CANVAS_MARGIN));
            int sizeOfSquare = sizeOfBoard / 8;
            int offset = sizeOfSquare / 2;
            int spacingX = CANVAS_MARGIN + offset + sizeOfSquare * x;

            for (int y = 0; y < 8; y++) {
                int spacingY = CANVAS_MARGIN + offset + sizeOfSquare * y;
                BufferedImage image = board[x][y].getImage();
                if (image == null) {
                    g.drawString(board[x][y].getCharacter(), spacingX, spacingY);
                } else {
                    g.drawImage(
                            image,
                            /*ImageManipulation.scale(image, sizeOfSquare, sizeOfSquare),*/
                            spacingX-offset+2,
                            spacingY-offset+2,
                            sizeOfSquare-4,
                            sizeOfSquare-4,
                            this
                    );
                }
            }
        }
    }
}
