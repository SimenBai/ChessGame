package no.simenbai.Chess.Game.Draw;

import javax.swing.*;
import java.awt.*;

import static no.simenbai.Chess.Game.Main.CANVAS_SIZE;

public class Canvas extends JFrame{

    // Declare an instance of the drawing canvas,
    // which is an inner class called DrawCanvas extending javax.swing.JPanel.
    private DrawCanvas canvas;

    // Constructor to set up the GUI components and event handlers
    public Canvas() {
        canvas = new DrawCanvas();    // Construct the drawing canvas
        canvas.setPreferredSize(new Dimension(CANVAS_SIZE, CANVAS_SIZE));

        // Set the Drawing JPanel as the JFrame's content-pane
        Container cp = getContentPane();
        cp.add(canvas);
        // or "setContentPane(canvas);"

        setDefaultCloseOperation(EXIT_ON_CLOSE);   // Handle the CLOSE button
        pack();              // Either pack() the components; or setSize()
        setTitle("Chess");  // "super" JFrame sets the title
        setVisible(true);    // "super" JFrame show
    }
    /**
     * Define inner class DrawCanvas, which is a JPanel used for custom drawing.
     */
    private class DrawCanvas extends JPanel {
        DrawBoard drawBoard = new DrawBoard();
        DrawPieces drawPieces = new DrawPieces();
        // Override paintComponent to perform your own painting
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);     // paint parent's background

            drawBoard.drawBoard(g);
            drawPieces.drawPieces(g);
        }
    }
}
