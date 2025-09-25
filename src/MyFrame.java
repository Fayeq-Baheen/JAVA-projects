import javax.swing.*;
import java.awt.*;
public class MyFrame extends JFrame{

    MyFrame(){
        this.setTitle("JFrame frame");
        this.setSize(800, 600);
        this.setResizable(false);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(0x123456));
    }

}
