import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MyLabel {
    public static void main(String args[]){
        ImageIcon imageIcon = new ImageIcon("image.png");
        Border border = BorderFactory.createLineBorder(Color.BLUE,3);

        JLabel label = new JLabel();
        label.setText("Hello, World");
        label.setIcon(imageIcon);
        label.setBackground(Color.BLACK);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setForeground(Color.GREEN);
        label.setIconTextGap(100);
        label.setOpaque(true);
        label.setVisible(true);
        label.setBorder(border);
        label.setFont(new Font("MV Boli",Font.ITALIC,28));

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(640,360);
        frame.add(label);
    }
}
