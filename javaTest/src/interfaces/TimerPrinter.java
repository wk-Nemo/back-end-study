package interfaces;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

public class TimerPrinter implements ActionListener {
  public void actionPerformed(ActionEvent event) {
    System.out.println("Now is " + Instant.ofEpochMilli(event.getWhen()));
    Toolkit.getDefaultToolkit().beep();
  }
}