package view;

import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.DesignsAndFormat;
import model.LoadAndResizeImage;

public class ConfirmEmail extends JFrame {
    
    LoadAndResizeImage loadAndResizeImage = new LoadAndResizeImage();
    DesignsAndFormat designsAndFormat = new DesignsAndFormat();
    ConfirmEmail(){
        initComponents();
    }

    private void initComponents(){
        ImageIcon confirmEmailImage = loadAndResizeImage.loadAndResize("/resources/images/email-verification.png", 180, 180);
        JLabel lbConfirmEmailImageContainer = new JLabel(confirmEmailImage);

        JPanel horizontalPanel1 = new JPanel();
        horizontalPanel1.setLayout(new BoxLayout(horizontalPanel1, BoxLayout.X_AXIS));
        horizontalPanel1.setBackground(designsAndFormat.mainBackgroundColor());
        horizontalPanel1.setBorder(BorderFactory.createEmptyBorder(30, 0, 0, 0));
        horizontalPanel1.setAlignmentX(CENTER_ALIGNMENT);
        horizontalPanel1.add(lbConfirmEmailImageContainer);


        JLabel lbConfirmationEmailTextHeader = new JLabel("Email Confirmation");
        lbConfirmationEmailTextHeader.setFont(designsAndFormat.mainFont().deriveFont(24f));
        lbConfirmationEmailTextHeader.setAlignmentX(CENTER_ALIGNMENT);

        JPanel horizontalPanel2 = new JPanel();
        horizontalPanel2.setLayout(new BoxLayout(horizontalPanel2, BoxLayout.X_AXIS));
        horizontalPanel2.setBackground(designsAndFormat.mainBackgroundColor());
        horizontalPanel2.setAlignmentX(CENTER_ALIGNMENT);
        horizontalPanel2.add(lbConfirmationEmailTextHeader);


        JLabel lbConfirmationEmailText1 = new JLabel("We have sent verification email to placeholder@gmail.com to confirm");
        lbConfirmationEmailText1.setFont(designsAndFormat.mainFont().deriveFont(12f));
        lbConfirmationEmailText1.setAlignmentX(CENTER_ALIGNMENT);
        
        JLabel lbConfirmationEmailText2 = new JLabel("the validity of your email address. After receiving the email");
        lbConfirmationEmailText2.setFont(designsAndFormat.mainFont().deriveFont(12f));
        lbConfirmationEmailText2.setAlignmentX(CENTER_ALIGNMENT);

        JLabel lbConfirmationEmailText3 = new JLabel("follow the link provided to complete your registration.");
        lbConfirmationEmailText3.setFont(designsAndFormat.mainFont().deriveFont(12f));
        lbConfirmationEmailText3.setAlignmentX(CENTER_ALIGNMENT);

        JPanel horizontalPanel3 = new JPanel();
        horizontalPanel3.setLayout(new BoxLayout(horizontalPanel3, BoxLayout.Y_AXIS));
        horizontalPanel3.setAlignmentX(CENTER_ALIGNMENT);
        horizontalPanel3.setBackground(designsAndFormat.mainBackgroundColor());
        horizontalPanel3.add(lbConfirmationEmailText1);
        horizontalPanel3.add(lbConfirmationEmailText2);
        horizontalPanel3.add(lbConfirmationEmailText3);


        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBackground(designsAndFormat.mainBackgroundColor());
        mainPanel.add(horizontalPanel1);
        mainPanel.add(horizontalPanel2);
        mainPanel.add(horizontalPanel3);

        add(mainPanel);
        setSize(650, 450);
        setTitle("Login");
        setSize(650,450);
        setMinimumSize(new Dimension(300, 300));
        setDefaultCloseOperation(Signin_view.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }
}
