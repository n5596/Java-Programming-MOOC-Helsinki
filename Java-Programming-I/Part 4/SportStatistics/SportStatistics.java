
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        
        int games = 0;
        int wins = 0;
        try (Scanner file_scanner = new Scanner(Paths.get(file))) {
            while (file_scanner.hasNextLine()) {
                String str = file_scanner.nextLine();
                String[] pieces = str.split(",");
                
                if (pieces[0].equals(team)){
                    if (Integer.valueOf(pieces[2]) > Integer.valueOf(pieces[3])){
                        wins += 1;
                    }
                    games += 1;
                } else if (pieces[1].equals(team)){
                    if (Integer.valueOf(pieces[2]) < Integer.valueOf(pieces[3])){
                        wins += 1;
                    }
                    games += 1;                    
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Games: "+games);
        System.out.println("Wins: "+wins);
        System.out.println("Losses: "+(games-wins));
    }

}
