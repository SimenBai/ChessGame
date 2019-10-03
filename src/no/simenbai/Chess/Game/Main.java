package no.simenbai.Chess.Game;

import no.simenbai.Chess.Game.Draw.Canvas;
import no.simenbai.Chess.Game.Logic.Board;

import javax.swing.*;

/**
 * Custom Drawing Code Template
 */
// A Swing application extends javax.swing.JFrame
public class Main{
    // Define constants
    public static final int CANVAS_MARGIN = 50;
    public static final int CANVAS_SIZE = 8 * 70 + CANVAS_MARGIN * 2;

    // The entry main method
    public static void main(String[] args) {
        // Run the GUI codes on the Event-Dispatching thread for thread safety
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Board board = new Board();
                board.createBoard();
                board.resetBoard();
                new Canvas(); // Let the constructor do the job
            }
        });
    }
}