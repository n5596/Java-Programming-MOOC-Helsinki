/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naila
 */
import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary sd;
    
    public TextUI(Scanner scanner, SimpleDictionary sd){
        this.scanner = scanner;
        this.sd = sd;
    }
    
    public void start(){
        while (true){
            System.out.println("Command:");
            String command = this.scanner.nextLine();
            if (command.equals("end")){
                System.out.println("Bye bye!");
                break;
            } else if (command.equals("add")){
                System.out.println("Word");
                String word = this.scanner.nextLine();
                System.out.println("Translation:");
                String translation = this.scanner.nextLine();
                this.sd.add(word, translation);
            } else if (command.equals("search")){
                System.out.println("To be translated:");
                String word = this.scanner.nextLine();
                String translation = this.sd.translate(word);
                if (translation == null){
                    System.out.println("Word "+word+" was not found");
                } else {
                    System.out.println("Translation: "+ translation);
                }
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}
