import javax.swing.*;
import java.awt.*;

public class JLableExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JLabel Example");

        JLabel label = new JLabel("Welcome to Java Swing!");

        label.setFont(new Font("Monospaced", Font.ITALIC, 18));
        label.setForeground(Color.YELLOW);
        label.setBounds(50, 50, 250, 30);

        frame.add(label);
        frame.setSize(350, 200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}