
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            String s = scanner.nextLine();
            if (s.equals("end")){
                break;
            }
            int num = Integer.valueOf(s);
            System.out.println(num*num*num);
        }

    }
}
