import javax.swing.*;
import java.awt.event.*;

public class TextFieldExample implements ActionListener {

    JTextField tf1, tf2, tf3;
    JButton b1, b2;

    TextFieldExample() {

        JFrame f = new JFrame();

        // Text Field 1
        tf1 = new JTextField();
        tf1.setBounds(50, 50, 150, 20);

        // Text Field 2
        tf2 = new JTextField();
        tf2.setBounds(50, 100, 150, 20);

        // Text Field 3 (Result)
        tf3 = new JTextField();
        tf3.setBounds(50, 150, 150, 20);
        tf3.setEditable(false);

        // Add Button
        b1 = new JButton("+");
        b1.setBounds(50, 200, 50, 50);

        // Subtract Button
        b2 = new JButton("-");
        b2.setBounds(120, 200, 50, 50);

        // Add ActionListener
        b1.addActionListener(this);
        b2.addActionListener(this);

        // Add components to JFrame
        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        f.add(b1);
        f.add(b2);

        // Frame settings
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);

        // Close application
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // Get values from TextFields
        String s1 = tf1.getText();
        String s2 = tf2.getText();

        // Convert String to Integer
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);

        int c = 0;

        // Check which button was clicked
        if (e.getSource() == b1) {

            // Addition
            c = a + b;

        } else if (e.getSource() == b2) {

            // Subtraction
            c = a - b;
        }

        // Convert result to String
        String result = String.valueOf(c);

        // Display result
        tf3.setText(result);
    }

    public static void main(String[] args) {

        new TextFieldExample();
    }
}