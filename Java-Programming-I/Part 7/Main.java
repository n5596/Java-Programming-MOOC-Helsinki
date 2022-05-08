
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        System.out.println("Enter point totals, -1 stops:");
        int sum1 = 0;
        int count1 = 0;
        int sum2 = 0;
        int count2 = 0;
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int zero = 0;
        
        while (true){
            int num = Integer.valueOf(scanner.nextLine());
            if (num == -1){
                break;
            }
            if (num < 0 || num > 100){
                continue;
            }
            sum1 += num;
            count1 += 1;
            if (num >= 50){
                sum2 += num;
                count2 += 1;
            }
            if (num >= 90){
                five += 1;
            } else if (num >= 80){
                four += 1;
            } else if (num >= 70){
                three += 1;
            } else if (num >= 60){
                two += 1;
            } else if (num >= 50){
                one += 1;
            } else if (num < 50){
                zero += 1;
            }
        }
        double avg1 = (double) (sum1)/count1;
        System.out.println("Point average (all): "+avg1);
        if (count2 > 0){
            double avg2 = (double) (sum2)/count2;
            System.out.println("Point average (passing): "+avg2);
        } else {
            System.out.println("Point average (passing): -");
        }       
        double percent = (double) 100*(count2)/count1;
        System.out.println("Pass percentage: "+percent);

        String s5 = "";
        for (int i=0; i<five; i++){
            s5 += "*";
        }
        System.out.println("5: "+ s5);
        
        String s4 = "";
        for (int i=0; i<four; i++){
            s4 += "*";
        }
        System.out.println("4: "+s4);
        
        String s3 = "";
        for (int i=0; i<three; i++){
            s3 += "*";
        }
        System.out.println("3: "+s3);
        
        String s2 = "";
        for (int i=0; i<two; i++){
            s2 += "*";
        }
        System.out.println("2: "+s2);
        
        String s1 = "";
        for (int i=0; i<one; i++){
            s1 += "*";
        }
        System.out.println("1: "+s1);
        
        String s0 = "";
        for (int i=0; i<zero; i++){
            s0 += "*";
        }
        System.out.println("0: "+s0);

    }
}
