
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        int flag = 0;
        try (Scanner file_scanner = new Scanner(Paths.get(file))) {
            while (file_scanner.hasNextLine()) {
                String name = file_scanner.nextLine();
                if (name.equals(searchedFor)){
                    flag = 1;
                    System.out.println("Found!");
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Reading the file "+file+" failed.");
        }
        
        if (flag == 0){
            System.out.println("Not found.");
        }
    }
}
