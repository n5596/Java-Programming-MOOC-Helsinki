
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name of the file:");
        String file = scanner.nextLine();
        System.out.println(file);
                
        try (Scanner file_scanner = new Scanner(Paths.get(file))) {
            while (file_scanner.hasNextLine()) {
                String str = file_scanner.nextLine();
                String[] pieces = str.split(",");
                
                System.out.println(pieces[0]+" , age: "+pieces[1]+" years");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
