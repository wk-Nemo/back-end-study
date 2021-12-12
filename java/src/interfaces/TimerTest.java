package interfaces;

import javax.swing.*;

public class TimerTest {
  public static void main(String[] args) {
    TimerPrinter listener = new TimerPrinter();
    Timer timer = new Timer(1000, listener);
    timer.start();

    JOptionPane.showMessageDialog(null, "Quit program?");
    System.exit(0);
  }
}
