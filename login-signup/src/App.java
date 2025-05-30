import java.util.Scanner;
import view.Signup_view;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int action;

        do{
        System.out.print("Press 1: SignIn\nPress 2: SignUp\nAction: ");
        action = sc.nextInt();

        switch(action){
            case 1:
            Signin_view signin_view = new Signin_view();
            signin_view.setVisible(true);
            break;
            
            case 2:
            Signup_view signup_view = new Signup_view();
            signup_view.setVisible(true);
            break;

            default:
            System.out.println("error");
            break;
        }
    }
    while(action != 1 || action != 2);
    sc.close();
    }
}
