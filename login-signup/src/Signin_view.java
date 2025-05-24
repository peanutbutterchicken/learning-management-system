import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

public class Signin_view extends JFrame {
    final private Font mainFont = new Font("Segoe print", Font.BOLD, 18);
    JTextField tfFirstName, tfLastName;

    public void initialize(){

        // Main Panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(0,2));
        mainPanel.setBackground(Color.WHITE);

        // First Panel
        JPanel firstPanel = new JPanel();
        firstPanel.setLayout(new GridLayout(0,1));
        firstPanel.setBackground(Color.BLUE);

        // Second Panel
        JPanel secondPanel = new JPanel();
        secondPanel.setLayout(new GridLayout(0,1));
        secondPanel.setBackground(Color.LIGHT_GRAY);

        add(mainPanel);

        mainPanel.add(firstPanel);
        mainPanel.add(secondPanel);

        setTitle("Login");
        setSize(800,500);
        setMinimumSize(new Dimension(300, 300));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }
}
