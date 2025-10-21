package lms.presentation;

import javax.swing.SwingUtilities;

/**
 * Application entry-point for the Library Management System.
 */
public final class App {

  private App() { }

  /**
   * Launches the Swing UI on the Event Dispatch Thread.
   * @param args CLI args (unused)
   */
  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      MainFrame frame = new MainFrame();
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
    });
  }
}
