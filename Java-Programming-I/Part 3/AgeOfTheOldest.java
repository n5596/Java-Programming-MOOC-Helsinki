
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = -1;
        
        while (true){
            String str = scanner.nextLine();
            
            if (str.equals("")){
                break;
            }
            String[] pieces = str.split(",");
            int age = Integer.valueOf(pieces[1]);
            if (age > oldest){
                oldest = age;
            }
        }
        System.out.println("Age of the oldest: "+oldest);
    }
}
