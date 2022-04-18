
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int longest = -1;
        String name = "";
        int years = 0;
        int count = 0;
        
        while (true){
            String str = scanner.nextLine();
            
            if (str.equals("")){
                break;
            }
            String[] pieces = str.split(",");
            if (pieces[0].length() > longest){
                longest = pieces[0].length();
                name = pieces[0];
            }
            int age = Integer.valueOf(pieces[1]);
            years += age;
            count += 1;
        }
        double avg = (double) years/count;
        System.out.println("Longest name: "+name);
        System.out.println("Average of the birth years: "+avg);
    }
}
