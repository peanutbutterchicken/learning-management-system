package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Buttons;
import model.DesignsAndFormat;
import model.LoadAndResizeImage;

public class ConfirmEmailCode extends JFrame {
    LoadAndResizeImage loadAndResizeImage = new LoadAndResizeImage();
    JTextField userCode;

    ConfirmEmailCode(){
        initComponents();
    }

    public void initComponents(){
        ImageIcon confirmEmailCodeImage = loadAndResizeImage.loadAndResize("/resources/images/email-verification-code-removebg-preview.png", 240, 240);
        JLabel confirmEmailCodeImageContainer = new JLabel(confirmEmailCodeImage);
        confirmEmailCodeImageContainer.setAlignmentX(CENTER_ALIGNMENT);
        confirmEmailCodeImageContainer.setBorder(BorderFactory.createEmptyBorder(0, 0, 50, 0));
        
        // image container
        JPanel gridPanel1 = new JPanel();
        gridPanel1.setLayout(new BorderLayout());
        gridPanel1.setBackground(DesignsAndFormat.whiteBackgroundColor());
        gridPanel1.add(confirmEmailCodeImageContainer);
        
        userCode = new JTextField();
        userCode.setMaximumSize(new Dimension(100, 29));
        userCode.setBorder(null);

        JButton btnSubmitUserCode = Buttons.standardBlueButton("Submit");

        
        JPanel jtxtCodeVerifyContainer = new JPanel();
        jtxtCodeVerifyContainer.setLayout(new BoxLayout(jtxtCodeVerifyContainer, BoxLayout.X_AXIS));
        jtxtCodeVerifyContainer.setBorder(BorderFactory.createEmptyBorder(0, 65, 0, 0));
        jtxtCodeVerifyContainer.add(userCode);
        jtxtCodeVerifyContainer.add(btnSubmitUserCode);

        // text field container
        JPanel gridPanel2 = new JPanel();
        gridPanel2.setLayout(new BorderLayout());
        gridPanel2.add(jtxtCodeVerifyContainer);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(0, 2));
        mainPanel.setBackground(DesignsAndFormat.whiteBackgroundColor());
        mainPanel.add(gridPanel1, BorderLayout.CENTER);
        mainPanel.add(gridPanel2, BorderLayout.CENTER);


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
