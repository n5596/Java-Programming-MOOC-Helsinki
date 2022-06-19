/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.domain;

/**
 *
 * @author naila
 */
public class Flight {
    private Plane plane;
    private Place departure;
    private Place destination;
    private int capacity;
    
    public Flight(Plane plane, Place dep_id, Place dest_id, int capacity){
        this.plane = plane;
        this.departure = dep_id;
        this.destination = dest_id;
        this.capacity = capacity;
    }
    
    public String toString(){
        return this.plane.getId() + " (" + this.capacity + " capacity) (" + this.departure.getId() + "-" + this.destination.getId() + ")"; 
    }
}
