package no.simenbai.Chess.Game;

import java.awt.*;       // Using AWT's Graphics and Color
import java.awt.event.*; // Using AWT event classes and listener interfaces
import javax.swing.*;    // Using Swing's components and containers

/**
 * Custom Drawing Code Template
 */
// A Swing application extends javax.swing.JFrame
public class CGTemplate extends JFrame {
    // Define constants
    public static final int CANVAS_MARGIN = 50;
    public static final int CANVAS_SIZE = 8 * 70 + CANVAS_MARGIN * 2;

    // Declare an instance of the drawing canvas,
    // which is an inner class called DrawCanvas extending javax.swing.JPanel.
    private DrawCanvas canvas;

    // Constructor to set up the GUI components and event handlers
    public CGTemplate() {
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
        // Override paintComponent to perform your own painting
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);     // paint parent's background
            setBackground(Color.WHITE);  // set background color for this JPanel

            Color BROWN = new Color(204, 134, 29);
            for (int i = 0; i < 8; i++) {

                String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H"};

                g.setFont(new Font("Monospaced", Font.PLAIN, 16));
                g.drawString(letters[i], CANVAS_MARGIN-CANVAS_MARGIN/3, (1+i)* (CANVAS_SIZE - (2 * CANVAS_MARGIN)) / 8 + (CANVAS_SIZE - (2 * CANVAS_MARGIN)) / 24);
                g.drawString(letters[i], CANVAS_SIZE-2*CANVAS_MARGIN/3, (1+i)* (CANVAS_SIZE - (2 * CANVAS_MARGIN)) / 8 + (CANVAS_SIZE - (2 * CANVAS_MARGIN)) / 24);

                for (int j = 0; j < 8; j++) {
                    if (j == 0) {
                        g.setFont(new Font("Monospaced", Font.PLAIN, 16));
                        g.drawString(Integer.toString(i+1), (i+1) * (CANVAS_SIZE - (2 * CANVAS_MARGIN)) / 8 + (CANVAS_SIZE - (2 * CANVAS_MARGIN)) / 40, CANVAS_MARGIN-CANVAS_MARGIN/3);
                        g.drawString(Integer.toString(i+1), (i+1) * (CANVAS_SIZE - (2 * CANVAS_MARGIN)) / 8 + (CANVAS_SIZE - (2 * CANVAS_MARGIN)) / 40, CANVAS_SIZE-2*CANVAS_MARGIN/3);
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

    // The entry main method
    public static void main(String[] args) {
        // Run the GUI codes on the Event-Dispatching thread for thread safety
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CGTemplate(); // Let the constructor do the job
            }
        });
    }
}