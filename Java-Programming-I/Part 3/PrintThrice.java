
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        String str = scanner.nextLine();
        String output = str+str+str;
        
        System.out.println(output);
    }
}
