
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int vals = 0;
        while (true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            
            if (num == 0){
                break;
            } else if (num > 0){
                sum += num;
                vals += 1;
            }
            
        }
        if (vals == 0){
            System.out.println("Cannot calculate the average");
        }
        double avg = (double) sum/vals;
        System.out.println(avg+"");
    }
}
