
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random gen = new Random();
        System.out.println("How many random numbers should be printed?");
        int num = Integer.valueOf(scanner.nextLine());
        
        for (int i=1; i<=num; i++){
            System.out.println(gen.nextInt(11));
        }
    }

}
