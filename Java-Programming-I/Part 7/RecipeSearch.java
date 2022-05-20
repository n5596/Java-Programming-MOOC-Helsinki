
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Files to read:");
        String filename = scanner.nextLine();
            
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        
        ArrayList<String> rows = new ArrayList<>();
        String s = "";
        try (Scanner file_scanner = new Scanner(Paths.get(filename))) {
            while (file_scanner.hasNextLine()) {
                String row = file_scanner.nextLine();
                if (row.equals("")){
                    rows.add(s);
                    s = "";
                } else {
                    if (s.equals("")){
                        s += row;
                    } else {
                        s += ": " + row;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        rows.add(s);
        
        while (true){
            System.out.println("Enter command:");
            String command = scanner.nextLine();
            
            if (command.equals("stop")){
                break;
            } else if (command.equals("list")){
                for (String r:rows){
                   String[] words = r.split(": ");
                   System.out.println(words[0] + ", cooking time: "+words[1]);
               }
            } else if (command.equals("find name")){
                System.out.println("Find name:");
                String searched_word = scanner.nextLine();
                for (String r: rows){
                    if (r.contains(searched_word)){
                        String[] words = r.split(": ");
                        System.out.println(words[0] + ", cooking time: "+words[1]);
                    }
                }
            } else if (command.equals("find cooking time")){
                System.out.println("Max cooking time:");
                int max_time = Integer.valueOf(scanner.nextLine());
                for (String r: rows){
                    String[] words = r.split(": ");
                    if (Integer.valueOf(words[1]) <= max_time){
                        System.out.println(words[0] + ", cooking time: "+words[1]);
                    }
                }
            } else if (command.equals("find ingredient")){
                System.out.println("Ingredient:");
                String ingredient = scanner.nextLine();
                
                for (String r: rows){
                    String[] words = r.split(": ");
                    for (String word: words){
                        if (word.equals(ingredient)){
                            System.out.println(words[0] + ", cooking time: "+words[1]);
                            break;
                        }
                    }
                }
            }
        }
    }

}
