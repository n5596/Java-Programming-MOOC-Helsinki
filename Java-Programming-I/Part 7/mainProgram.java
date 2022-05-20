
import java.util.Scanner;
import java.util.ArrayList;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        ArrayList<Bird> birds = new ArrayList<>();
        
        while (true){
            System.out.println("?");
            String command = scan.nextLine();
            
            if (command.equals("Quit")){
                break;
            }
            
            if (command.equals("Add")){
                System.out.println("Name:");
                String name = scan.nextLine();
                System.out.println("Name in Latin:");
                String latin = scan.nextLine();
                
                Bird new_bird = new Bird(name, latin);
                birds.add(new_bird);
            } else if (command.equals("Observation")){
                System.out.println("Bird?");
                String ob_bird = scan.nextLine();
                
                int flag = 0;
                for (Bird b:birds){
                    if (b.getName().equals(ob_bird)){
                        flag = 1;
                        b.addObservation();
                    }
                }
                if (flag == 0){
                    System.out.println("Not a bird!");
                }
            } else if (command.equals("All")){
                for (Bird b:birds){
                    b.printBird();
                }
            } else if (command.equals("One")){
                System.out.println("Bird?");
                String search_bird = scan.nextLine();
                
                for (Bird b:birds){
                    if (b.getName().equals(search_bird)){
                        b.printBird();
                    }
                }
            }
        }
    }

}
