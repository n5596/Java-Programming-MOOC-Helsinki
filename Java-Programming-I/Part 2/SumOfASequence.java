
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Last number?");
        int num = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        
        for (int i=1; i<=num; i++){
            sum += i;
        }
        System.out.println("The sum is "+sum);
    }
}
