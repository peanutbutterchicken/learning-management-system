package view;

import model.LoadAndResizeImage;
import model.DesignsAndFormat;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Signup_view extends JFrame{
        final private Font mainFont = new Font("Sansserif", Font.BOLD, 18);
        final private Font titleFont = mainFont.deriveFont(42f);
        DesignsAndFormat designsAndFormat = new DesignsAndFormat();

        LoadAndResizeImage x = new LoadAndResizeImage();

        public Signup_view(){
            initComponents();
        }

        private void initComponents(){
 
            //image container
            ImageIcon signupImage = x.loadAndResize("/resources/images/signup-image.png", 256, 256);
            JLabel signUpImageContainer = new JLabel(signupImage);

            JPanel panel1 = new JPanel(new BorderLayout());
            panel1.setBackground(designsAndFormat.mainBackgroundColor());
            panel1.add(signUpImageContainer);

            JPanel panel2 = new JPanel();

            JPanel mainPanel = new JPanel(new GridLayout(0,2));
            mainPanel.add(panel1, BorderLayout.CENTER);
            mainPanel.add(panel2);
            //add two panels here

            add(mainPanel);
            setTitle("SignUp");
            setSize(800, 500);
            setMinimumSize(new Dimension(300, 300));
            setDefaultCloseOperation(Signup_view.EXIT_ON_CLOSE);
            setVisible(true);
            setLocationRelativeTo(null);
        }
}
