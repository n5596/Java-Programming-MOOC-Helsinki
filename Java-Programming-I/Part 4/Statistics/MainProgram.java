
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        Statistics s1 = new Statistics();
        Statistics s2 = new Statistics();
        Statistics s3 = new Statistics();

        while (true){
            System.out.println("Enter numbers:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1){
                break;
            }
            if (number % 2 == 0){
                s2.addNumber(number);
            } else {
                s3.addNumber(number);
            }
            s1.addNumber(number);
        }
        System.out.println("Sum: "+s1.sum());
        System.out.println("Sum of even numbers: "+s2.sum());
        System.out.println("Sum of odd numbers: "+s3.sum());
    }
}
