package view;

import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

import model.DesignsAndFormat;

public class ConfirmEmailCode extends JFrame {
    ConfirmEmailCode(){
        initComponents();
    }

    public void initComponents(){
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));
        mainPanel.setBackground(DesignsAndFormat.whiteBackgroundColor());


        add(mainPanel);
        setSize(650, 450);
        setTitle("Email Confirmation");
        setSize(650,450);
        setMinimumSize(new Dimension(300, 300));
        setDefaultCloseOperation(ConfirmEmailCode.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }
}
