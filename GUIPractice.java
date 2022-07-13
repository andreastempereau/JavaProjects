import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class GUIPractice {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JLabel label1 = new JLabel();

        label1.setText("Test");
        //label1.setVerticalAlignment(JLabel.TOP);
        //label1.setHorizontalAlignment(JLabel.RIGHT);
        label1.setBounds(0, 0, 75, 75);

        panel1.setBackground(Color.RED);
        panel2.setBackground(Color.BLUE);
        panel3.setBackground(Color.GREEN);
        panel1.setBounds(0, 0, 250, 250);
        panel2.setBounds(250, 0, 250, 250);
        panel3.setBounds(0, 250, 500, 250);
        panel1.setLayout(null);
        panel2.setLayout(null);
        panel3.setLayout(null);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setSize(750, 750);
        f.setVisible(true);
        panel2.add(label1);
        f.add(panel1);
        f.add(panel2);
        f.add(panel3);
        f.validate();
    }
}
