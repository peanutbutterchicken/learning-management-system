package view;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Action: ");
        int action = sc.nextInt();

        do{
            switch(action){
                case 1:
                ConfirmEmail confirmEmail = new ConfirmEmail();
                confirmEmail.setVisible(true);
                break;

                case 2:
                Signin_view signin_view = new Signin_view();
                signin_view.setVisible(true);
                break;
                
                default:
                break;
            }
        }
        while(action<=0);
        
        sc.close();
    }
}
