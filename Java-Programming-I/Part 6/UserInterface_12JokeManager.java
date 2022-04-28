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

public class UserInterface {
    private Scanner scanner;
    private JokeManager jokemanager;
    
    public UserInterface(JokeManager jokemanager, Scanner scanner){
        this.jokemanager = jokemanager;
        this.scanner = scanner;
    }
    
    public void start(){
        while (true){
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            
            String command = this.scanner.nextLine();
            if (command.equals("X")){
                break;
            } else if (command.equals("1")){
                System.out.println("Write the joke to be added:");
                String joke = this.scanner.nextLine();
                this.jokemanager.addJoke(joke);
            } else if (command.equals("2")){
                String joke = this.jokemanager.drawJoke();
                System.out.println(joke);
            } else if (command.equals("3")) {
                System.out.println("Printing the jokes.");
                this.jokemanager.printJokes();
            }
        }
    }
}
