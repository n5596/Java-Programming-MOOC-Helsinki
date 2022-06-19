/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.ui;

/**
 *
 * @author naila
 */
import java.util.Scanner;
import FlightControl.logic.ControlLogic;

public class UserInterface {
    private Scanner ui;
    private ControlLogic control;
    
    public UserInterface(){
        this.ui = new Scanner(System.in);
        this.control = new ControlLogic();
    }
    
    public void start(){
        this.startAirportAssetControl();
        System.out.println("");
        this.startFlightControl();
    }
 
    public void startAirportAssetControl(){
        System.out.println("Airport Asset Control");
        System.out.println("--------------------");
        System.out.println();
        
        while (true){
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");
            System.out.print("> ");
        
            String s = this.ui.nextLine();
            if (s.equals("x")){
                break;
            } else if (s.equals("1")){
                System.out.print("Give the airplane id: ");
                String id = this.ui.nextLine();
                System.out.print("Give the airplane capacity: ");
                int capacity = Integer.valueOf(this.ui.nextLine());
                this.control.addPlane(id, capacity);
                
            } else if (s.equals("2")){
                System.out.print("Give the airplane id: ");
                String id = this.ui.nextLine();
                System.out.print("Give the departure airport id: ");
                String dep_id = this.ui.nextLine();
                System.out.print("Give the target airport id: ");
                String dest_id = this.ui.nextLine();
                this.control.addFlight(id, dep_id, dest_id);
            }
        }
    }
   
    
    public void startFlightControl(){
        System.out.println("Flight Control");
        System.out.println("--------------------");
        System.out.println();
        
        while (true){
            System.out.println("Choose an action:");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");
            System.out.print("> ");
            
            String s = this.ui.nextLine();
            if (s.equals("x")){
                break;
            } else if (s.equals("1")){
                this.control.printPlanes();
            } else if (s.equals("2")){
                this.control.printFlights();
            } else if (s.equals("3")){
                System.out.print("Give the airplane id: ");
                String id = this.ui.nextLine();
                this.control.printPlaneDetails(id);
            }
        }
    }
}
