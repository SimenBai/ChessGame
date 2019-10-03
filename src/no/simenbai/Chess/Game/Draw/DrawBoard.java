package no.simenbai.Chess.Game.Draw;

import javax.swing.*;
import java.awt.*;

import static no.simenbai.Chess.Game.Main.CANVAS_MARGIN;
import static no.simenbai.Chess.Game.Main.CANVAS_SIZE;

public class DrawBoard extends JPanel {
    void drawBoard(Graphics g){
        setBackground(Color.WHITE);  // set background color for this JPanel

        Color BROWN = new Color(204, 134, 29);
        for (int i = 0; i < 8; i++) {

            String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H"};

            g.setFont(new Font("Monospaced", Font.PLAIN, 16));

            int spacingY = (1 + i) * (CANVAS_SIZE - (2 * CANVAS_MARGIN)) / 8 + (CANVAS_SIZE - (2 * CANVAS_MARGIN)) / 24;
            g.drawString(letters[i], CANVAS_MARGIN-CANVAS_MARGIN/3, spacingY);
            g.drawString(letters[i], CANVAS_SIZE-2*CANVAS_MARGIN/3, spacingY);

            for (int j = 0; j < 8; j++) {
                if (j == 0) {
                    g.setFont(new Font("Monospaced", Font.PLAIN, 16));
                    int spacingX = (1 + i) * (CANVAS_SIZE - (2 * CANVAS_MARGIN)) / 8 + (CANVAS_SIZE - (2 * CANVAS_MARGIN)) / 40;
                    g.drawString(Integer.toString(i+1), spacingX, CANVAS_MARGIN-CANVAS_MARGIN/3);
                    g.drawString(Integer.toString(i+1), spacingX, CANVAS_SIZE-2*CANVAS_MARGIN/3);
                }

                if (j % 2 == 1) {
                    if (i % 2 == 1) {
                        g.setColor(Color.WHITE);
                    } else {
                        g.setColor(BROWN);
                    }
                } else {
                    if (i % 2 == 1) {
                        g.setColor(BROWN);
                    } else {
                        g.setColor(Color.WHITE);
                    }
                }
                g.fillRect(CANVAS_MARGIN + (CANVAS_SIZE - (2 * CANVAS_MARGIN)) / 8 * i,
                        CANVAS_MARGIN + (CANVAS_SIZE - (2 * CANVAS_MARGIN)) / 8 * j,
                        (CANVAS_SIZE - (2 * CANVAS_MARGIN)) / 8,
                        (CANVAS_SIZE - (2 * CANVAS_MARGIN)) / 8
                );
                g.setColor(Color.BLACK);
                g.drawRect(CANVAS_MARGIN + (CANVAS_SIZE - (2 * CANVAS_MARGIN)) / 8 * i,
                        CANVAS_MARGIN + (CANVAS_SIZE - (2 * CANVAS_MARGIN)) / 8 * j,
                        (CANVAS_SIZE - (2 * CANVAS_MARGIN)) / 8,
                        (CANVAS_SIZE - (2 * CANVAS_MARGIN)) / 8);
            }
        }
        g.setColor(Color.BLACK);       // change the drawing color
        g.drawRect(CANVAS_MARGIN, CANVAS_MARGIN, CANVAS_SIZE - 2 * CANVAS_MARGIN, CANVAS_SIZE - 2 * CANVAS_MARGIN);
    }
}
