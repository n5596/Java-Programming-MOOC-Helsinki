
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container first = new Container();
        Container second = new Container();
        System.out.println("First: "+first.toString());
        System.out.println("Second: "+second.toString());
        
        while (true) {
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] strs = input.split(" ");
            int num = Integer.valueOf(strs[1]);
            
            if (strs[0].equals("add")){
                first.add(num);
            } else if (strs[0].equals("move")){
                if (first.contains() < num){
                    num = first.contains();
                }
                first.remove(num);
                second.add(num);
            } else if (strs[0].equals("remove")){
                second.remove(num);
            }
            
            System.out.println("First: "+first.toString());
            System.out.println("Second: "+second.toString());

        }
    }

}
