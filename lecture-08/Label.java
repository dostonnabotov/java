import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Label {
  public static void main(String[] args) {
    ImageIcon image = new ImageIcon("./assets/chrome.png");
    Border border = BorderFactory.createLineBorder(Color.GREEN, 2);

    JLabel label = new JLabel();
    label.setText("Google Chrome");
    label.setIcon(image);
    label.setHorizontalTextPosition(JLabel.CENTER);
    label.setVerticalTextPosition(JLabel.TOP);
    
    label.setForeground(new Color(50, 200, 100));
    label.setFont(new Font("Serif", Font.PLAIN, 20));
    label.setIconTextGap(10);
    
    label.setBackground(Color.BLACK);
    label.setOpaque(true);

    label.setBorder(border);
    label.setVerticalAlignment(JLabel.CENTER);
    label.setHorizontalAlignment(JLabel.CENTER);
    // label.setBounds(0, 0, 200, 200);

    // Frame
    JFrame frame = new JFrame();
    frame.setTitle("Java GUI Tutorial - Labels");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 500);
    // frame.setLayout(null);
    frame.setVisible(true);
    frame.add(label);
  }
}
