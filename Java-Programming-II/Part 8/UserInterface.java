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
    private TodoList t;
    private Scanner s;
    
    public UserInterface(TodoList t, Scanner s){
        this.t = t;
        this.s = s;
    }
    
    public void start(){
        while (true){
            System.out.println("Command:");
            String command = this.s.nextLine();
            if (command.equals("stop")){
                break;
            } else if (command.equals("add")){
                System.out.println("To add:");
                String add_string = this.s.nextLine();
                this.t.add(add_string);
            } else if (command.equals("list")){
                this.t.print();
            } else if (command.equals("remove")){
                System.out.println("Which one is removed?");
                Integer remove_idx = Integer.valueOf(this.s.nextLine());
                this.t.remove(remove_idx);
            }
        }
    }
}
