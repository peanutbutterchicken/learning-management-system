    import javax.swing.BorderFactory;
    import javax.swing.BoxLayout;
    import javax.swing.ImageIcon;
    import javax.swing.JButton;
    import javax.swing.JFrame;
    import javax.swing.JPanel;
    import javax.swing.JPasswordField;
    import javax.swing.JTextField;

import model.DesignsAndFormat;

import javax.swing.JLabel;

    import java.awt.BorderLayout;
    import java.awt.Color;
    import java.awt.Dimension;
    import java.awt.Font;
    import java.awt.GridLayout;
    import java.awt.Image;

    public class Signin_view extends JFrame {
        DesignsAndFormat designsAndFormat = new DesignsAndFormat();

        private JTextField usernameField;
        private JPasswordField passwordField;

        public Signin_view(){
            initComponents();
        }

        private void initComponents(){

            //image container
            ImageIcon signinImageIcon = loadAndResizeIcon("/resources/images/signin-image.png", 256, 256);
            JLabel signinImage = new JLabel(signinImageIcon);

            JPanel panel1 = new JPanel(new BorderLayout());    
            panel1.add(signinImage);

            //signin components
            JLabel formTitle = new JLabel("Signin");
            formTitle.setFont(designsAndFormat.mainFont().deriveFont(42f));
            formTitle.setPreferredSize(new Dimension(0, 150));
            formTitle.setHorizontalAlignment(formTitle.LEFT);
            
            JLabel lbUsername = new JLabel(new ImageIcon(getClass().getResource("/resources/icons/userIcon.png")));
            usernameField = new JTextField();
            usernameField.setMaximumSize(new Dimension(300, 40));
            usernameField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.GRAY));
            usernameField.setOpaque(false); 

            JLabel lbPassword = new JLabel(new ImageIcon(getClass().getResource("/resources/icons/pwIcon.png")));
            passwordField = new JPasswordField();
            passwordField.setMaximumSize(new Dimension(300, 40));
            passwordField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.GRAY)); // bottom line only
            passwordField.setOpaque(false); 

            JPanel horizontalContainer1 = new JPanel();
            horizontalContainer1.setLayout(new BoxLayout(horizontalContainer1, BoxLayout.X_AXIS));
            horizontalContainer1.add(lbUsername);
            horizontalContainer1.add(usernameField);

            JPanel horizontalContainer2 = new JPanel();
            horizontalContainer2.setLayout(new BoxLayout(horizontalContainer2, BoxLayout.X_AXIS));
            horizontalContainer2.add(lbPassword);
            horizontalContainer2.add(passwordField);

            JButton btnSignin = new JButton("Signin");

            JPanel verticalContainer = new JPanel();
            verticalContainer.setLayout(new BoxLayout(verticalContainer, BoxLayout.Y_AXIS));
            verticalContainer.add(horizontalContainer1);
            verticalContainer.add(horizontalContainer2);
            verticalContainer.add(btnSignin);

            //signin components container
            JPanel panel2 = new JPanel();
            panel2.setLayout(new BorderLayout());

            panel2.add(formTitle, BorderLayout.NORTH);
            panel2.add(verticalContainer, BorderLayout.CENTER);

            //main panel
            JPanel mainPanel = new JPanel();
            mainPanel.setLayout(new GridLayout(0, 2));
            mainPanel.add(panel1, BorderLayout.CENTER); // panel1 contains image
            mainPanel.add(panel2); // panel2 contains set of multiple panels with different layouts and contains multiple components

            add(mainPanel);
            setTitle("Login");
            setSize(800,500);
            setMinimumSize(new Dimension(300, 300));
            setDefaultCloseOperation(Signin_view.EXIT_ON_CLOSE);
            setVisible(true);
            setLocationRelativeTo(null);
        }

        public String getUsername(){
            return usernameField.getText();
        }

        public char[] getPassword(){
            return passwordField.getPassword();
        }

        public ImageIcon loadAndResizeIcon(String path, int width, int height){
            ImageIcon icon = new ImageIcon(getClass().getResource(path));
            Image scaled = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
            return new ImageIcon(scaled);
        }
    }
