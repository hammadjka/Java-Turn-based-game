import view.Game;

import javax.swing.*;
/**
 * A class for the main method.
 *
 */
public class Main {
    /**
     * main method, entry point of the program.
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Game();
            }
        });
    }
}
