
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;
        System.out.println("First: 0/100");
        System.out.println("Second: 0/100");
        while (true) {
            //System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] strs = input.split(" ");
            int num = Integer.valueOf(strs[1]); 
            
            if (strs[0].equals("add")){
                if (num > 0){
                    first += num;
                    if (first > 100){
                        first = 100;
                    }
                }
            } else if (strs[0].equals("move")){
                if (num > 0){
                    if (num > first){
                        num = first;
                    }
                    first -= num;
                    second += num;
                    if (first < 0){
                        first = 0;
                    }
                    if (second > 100){
                        second = 100;
                    }
                }
            } else if (strs[0].equals("remove")){
                if (num > 0){
                    second -= num;
                    if (second < 0){
                        second = 0;
                    }
                }
            }
            System.out.println("First: "+first+"/100");
            System.out.println("Second: "+second+"/100");
        }
    }

}
