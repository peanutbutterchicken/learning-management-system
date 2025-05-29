package view;

import model.LoadAndResizeImage;
import model.DesignsAndFormat;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Signup_view extends JFrame{
        DesignsAndFormat designsAndFormat = new DesignsAndFormat();
        LoadAndResizeImage loadAndResizeImage = new LoadAndResizeImage();

        public Signup_view(){
            initComponents();
        }

        private void initComponents(){
 
            JPanel panel1 = new JPanel();

            // image container
            ImageIcon signupImage = loadAndResizeImage.loadAndResize("/resources/images/signup-image.png", 256, 256);
            JLabel signUpImageContainer = new JLabel(signupImage);

            JPanel panel2 = new JPanel(new BorderLayout());
            panel2.setBackground(designsAndFormat.mainBackgroundColor());
            panel2.add(signUpImageContainer);

            JPanel mainPanel = new JPanel(new GridLayout(0,2));
            mainPanel.add(panel1);
            mainPanel.add(panel2, BorderLayout.CENTER);

            add(mainPanel);
            setTitle("SignUp");
            setSize(800, 500);
            setMinimumSize(new Dimension(300, 300));
            setDefaultCloseOperation(Signup_view.EXIT_ON_CLOSE);
            setVisible(true);
            setLocationRelativeTo(null);
        }
}
