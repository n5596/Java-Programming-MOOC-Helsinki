
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here

        System.out.println("Input numbers, type \"end\" to stop.");
        ArrayList<String> strings = new ArrayList<>();
        while (true){
            String s = scanner.nextLine();
            if (s.equals("end")){
                break;
            }
            strings.add(s);
        }
        double average = strings.stream().mapToInt(s -> Integer.valueOf(s)).average().getAsDouble();
        System.out.println("average of the numbers: "+average);
        
    }
}
