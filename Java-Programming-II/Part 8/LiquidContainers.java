
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;
        
        System.out.println("First: 0/100");
        System.out.println("Second: 0/100");
        while (true) {
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] words = input.split(" ");
            int value = Integer.valueOf(words[1]);
            if (value < 0){
                value = 0;
            }
            
            if (words[0].equals("add")){
                first += value;
                if (first > 100){
                    first = 100;
                }
            } else if (words[0].equals("move")){
                if (first < value){
                    value = first;
                }
                first -= value;
                second += value;
                
                if (second > 100){
                    second = 100;
                }
            } else if (words[0].equals("remove")){
                if (second < value){
                    value = second;
                }
                second -= value;
            }
            System.out.println("First: "+first+"/100");
            System.out.println("Second: "+second+"/100");
        }
    }

}
