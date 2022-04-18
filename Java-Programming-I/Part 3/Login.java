
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username:");
        String user = scanner.nextLine();
        System.out.println("Enter password:");
        String pw = scanner.nextLine();
        
        if (user.equals("alex") && pw.equals("sunshine")){
            System.out.println("You have successfully logged in!");
        } else if (user.equals("emma") && pw.equals("haskell")){
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
