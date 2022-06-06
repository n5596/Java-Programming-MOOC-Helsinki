
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne

        System.out.println("Input numbers, type \"end\" to stop.");
        ArrayList<String> strings = new ArrayList<>();
        while (true){
            String s = scanner.nextLine();
            if (s.equals("end")){
                break;
            }
            strings.add(s);
        }
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String flag = scanner.nextLine();
        
        String type;
        double average;
        if (flag.equals("n")){
            type = "negative";
            average = strings.stream().mapToInt(s -> Integer.valueOf(s)).filter(s -> s < 0).average().getAsDouble();
        } else {
            type = "positive";
            average = strings.stream().mapToInt(s -> Integer.valueOf(s)).filter(s -> s >= 0).average().getAsDouble();            
        }
        System.out.println("Average of the "+type+" numbers: "+average);
    }
}
