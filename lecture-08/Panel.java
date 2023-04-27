import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel {
  public static void main(String[] args) {

    ImageIcon icon = new ImageIcon("./assets/chrome.png");

    JLabel label = new JLabel();
    label.setText("Hi");
    label.setIcon(icon);
    label.setBounds(0, 0, 100, 100);

    JPanel redPanel = new JPanel();
    redPanel.setBackground(Color.RED);
    redPanel.setBounds(0, 0, 250, 250);
    redPanel.setLayout(null);

    JPanel bluePanel = new JPanel();
    bluePanel.setBackground(Color.BLUE);
    bluePanel.setBounds(250, 0, 250, 250);
    bluePanel.setLayout(null);
    
    JPanel greenPanel = new JPanel();
    greenPanel.setBackground(Color.GREEN);
    greenPanel.setBounds(0, 250, 500, 250);
    greenPanel.setLayout(null);

    JFrame frame = new JFrame();
    frame.setTitle("Java GUI Tutorial - Panels");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 500);
    frame.setVisible(true);
    frame.setLayout(null);

    bluePanel.add(label);
    frame.add(redPanel);
    frame.add(bluePanel);
    frame.add(greenPanel);
  }
}