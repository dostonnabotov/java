import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Frame {
  public static void main(String[] args) {
    ImageIcon image = new ImageIcon("./assets/chrome.png");

    JFrame frame = new JFrame();
    frame.setTitle("Java GUI Tutorial");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setResizable(true);
    frame.setSize(500, 500);
    frame.setVisible(true);
    frame.setIconImage(image.getImage());
    frame.getContentPane().setBackground(new Color(220, 220, 220));
  }
}
