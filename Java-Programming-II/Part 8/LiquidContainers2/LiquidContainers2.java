
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container first = new Container();
        Container second = new Container();
        
        System.out.println("First: "+first);
        System.out.println("Second: "+second);
        
        while (true) {
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] words = input.split(" ");
            Integer value = Integer.valueOf(words[1]);
            
            if (words[0].equals("add")){
                first.add(value);
            } else if (words[0].equals("move")){
                Integer f = first.contains();
                if (f < value){
                    value = f;
                }
                first.remove(value);
                second.add(value);
            } else if (words[0].equals("remove")){
                second.remove(value);
            }
            
            System.out.println("First: "+first);
            System.out.println("Second: "+second);
        }
    }

}
