
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {

        String file = "literacy.csv";
        // Used compareTo method of double since sorted needs to return an int and typecasting fails
        try {
            Files.lines(Paths.get(file)).map(row -> row.split(",")).sorted((p1, p2) -> {return Double.valueOf(p1[5]).compareTo(Double.valueOf(p2[5]));}).forEach(p -> System.out.println(p[3]+" ("+p[4]+"), "+p[2].trim().split(" ")[0]+", "+p[5]));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
