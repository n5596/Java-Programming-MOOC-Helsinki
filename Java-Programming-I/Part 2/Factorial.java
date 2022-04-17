
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int num = Integer.valueOf(scanner.nextLine());
        int prod = 1;
        
        for (int i=1; i<=num; i++){
            prod *= i;
        }
        System.out.println("Factorial: "+prod);
    }
}
