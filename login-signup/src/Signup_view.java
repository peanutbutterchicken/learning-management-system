

import model.LoadAndResizeImage;
import model.DesignsAndFormat;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Signup_view extends JFrame{
        DesignsAndFormat designsAndFormat = new DesignsAndFormat();
        LoadAndResizeImage loadAndResizeImage = new LoadAndResizeImage();

        private JTextField jtxtPrefUsername, jtxtUserEmail;
        private JPasswordField jtxtPrefPassword;

        public Signup_view(){
            initComponents();
        }

        private void initComponents(){

            JLabel lbTitle = new JLabel("SignUp");
            lbTitle.setFont(designsAndFormat.mainFont().deriveFont(42f));
            lbTitle.setPreferredSize(new Dimension(0, 150));
            lbTitle.setHorizontalAlignment(JLabel.CENTER);

            JLabel lbPrefUsername = new JLabel(new ImageIcon(getClass().getResource("/resources/icons/userIcon.png")));
            jtxtPrefUsername = new JTextField();
            jtxtPrefUsername.setMaximumSize(new Dimension(200, 40));
            jtxtPrefUsername.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.GRAY));
            jtxtPrefUsername.setOpaque(false); 

            JPanel horizontalPanel1 = new JPanel();
            horizontalPanel1.setLayout(new BoxLayout(horizontalPanel1, BoxLayout.X_AXIS));
            horizontalPanel1.setBackground(designsAndFormat.mainBackgroundColor());
            horizontalPanel1.add(lbPrefUsername);
            horizontalPanel1.add(jtxtPrefUsername);
            horizontalPanel1.setAlignmentX(JPanel.CENTER_ALIGNMENT);
            
            JLabel lbPrefPassword = new JLabel(new ImageIcon(getClass().getResource("/resources/icons/pwIcon.png")));
            jtxtPrefPassword = new JPasswordField();
            jtxtPrefPassword.setMaximumSize(new Dimension(200, 40));
            jtxtPrefPassword.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.GRAY));
            jtxtPrefPassword.setOpaque(false); 
            
            JPanel horizontalPanel2 = new JPanel();
            horizontalPanel2.setLayout(new BoxLayout(horizontalPanel2, BoxLayout.X_AXIS));
            horizontalPanel2.setBackground(designsAndFormat.mainBackgroundColor());
            horizontalPanel2.add(lbPrefPassword);
            horizontalPanel2.add(jtxtPrefPassword);
            horizontalPanel2.setAlignmentX(JPanel.CENTER_ALIGNMENT);


            JLabel lbConfirmEmail = new JLabel(new ImageIcon(getClass().getResource("/resources/icons/checkCircle.png")));
            JPasswordField jtxtConfirmUserPassword = new JPasswordField();
            jtxtConfirmUserPassword.setMaximumSize(new Dimension(200, 40));
            jtxtConfirmUserPassword.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.GRAY));
            jtxtConfirmUserPassword.setOpaque(false);

            JPanel horizontalPanel3 = new JPanel();
            horizontalPanel3.setLayout(new BoxLayout(horizontalPanel3, BoxLayout.X_AXIS));
            horizontalPanel3.setBackground(designsAndFormat.mainBackgroundColor());
            horizontalPanel3.add(lbConfirmEmail);
            horizontalPanel3.add(jtxtConfirmUserPassword);
            horizontalPanel3.setAlignmentX(JPanel.CENTER_ALIGNMENT);

            JLabel lbUserEmail = new JLabel(new ImageIcon(getClass().getResource("/resources/icons/email.png")));
            jtxtUserEmail = new JTextField();
            jtxtUserEmail.setMaximumSize(new Dimension(200, 40));
            jtxtUserEmail.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.GRAY));
            jtxtUserEmail.setOpaque(false);


            JPanel horizontalPanel4 = new JPanel();
            horizontalPanel4.setLayout(new BoxLayout(horizontalPanel4, BoxLayout.X_AXIS));
            horizontalPanel4.setBackground(designsAndFormat.mainBackgroundColor());
            horizontalPanel4.add(lbUserEmail);
            horizontalPanel4.add(jtxtUserEmail);
            horizontalPanel4.setAlignmentX(JPanel.CENTER_ALIGNMENT);


            JButton btnSignup = new JButton("SignUp");

            JPanel horizontalPanel5 = new JPanel();
            horizontalPanel5.setMaximumSize(new Dimension(200, 40));
            horizontalPanel5.setBackground(designsAndFormat.mainBackgroundColor());
            horizontalPanel5.add(btnSignup);


            JLabel lbAlreadyHaveAnAccount = new JLabel("Already have an account? ");
            JLabel lbAlreadyHaveAnAccountLink = new JLabel("SignIn");

            lbAlreadyHaveAnAccountLink.addMouseListener(new MouseAdapter() {
                @Override

                public void mouseClicked(MouseEvent evt){
                    Signin_view signin_view = new Signin_view();
                    signin_view.setVisible(true);
                    Signup_view.this.dispose();
                }

                @Override
                public void mouseEntered(MouseEvent evt){
                    lbAlreadyHaveAnAccountLink.setForeground(Color.BLUE);
                }

                @Override
                public void mouseExited(MouseEvent evt){
                    lbAlreadyHaveAnAccountLink.setForeground(Color.BLACK);
                }
            });

            JPanel horizontalPanel6 = new JPanel();
            horizontalPanel6.setLayout(new BoxLayout(horizontalPanel6, BoxLayout.X_AXIS));
            horizontalPanel6.setMaximumSize(new Dimension(200, 40));
            horizontalPanel6.setBackground(designsAndFormat.mainBackgroundColor());
            horizontalPanel6.add(lbAlreadyHaveAnAccount);
            horizontalPanel6.add(lbAlreadyHaveAnAccountLink);


            JPanel verticalPanel = new JPanel();
            verticalPanel.setLayout(new BoxLayout(verticalPanel, BoxLayout.Y_AXIS));
            verticalPanel.setBackground(designsAndFormat.mainBackgroundColor());
            verticalPanel.add(horizontalPanel1);
            verticalPanel.add(horizontalPanel2);
            verticalPanel.add(horizontalPanel3);
            verticalPanel.add(horizontalPanel4);
            verticalPanel.add(horizontalPanel5);
            verticalPanel.add(horizontalPanel6);

            JPanel panel1 = new JPanel();
            panel1.setLayout(new BorderLayout());
            panel1.setBackground(designsAndFormat.mainBackgroundColor());
            panel1.add(lbTitle, BorderLayout.NORTH);
            panel1.add(verticalPanel, BorderLayout.CENTER);

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
