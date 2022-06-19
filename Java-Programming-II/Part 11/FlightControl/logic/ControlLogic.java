/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.logic;

import FlightControl.domain.Flight;
import FlightControl.domain.Place;
import FlightControl.domain.Plane;
import java.util.HashMap;

/**
 *
 * @author naila
 */
public class ControlLogic {
    private HashMap<String, Flight> flights;
    private HashMap<String, Place> places;
    private HashMap<String, Plane> planes;
    
    public ControlLogic(){
        this.flights = new HashMap<>();
        this.places = new HashMap<>();
        this.planes = new HashMap<>();
    }
    
    public void addPlane(String id, int capacity){
        this.planes.put(id, new Plane(id, capacity));
    }
    
    public void addFlight(String id, String dep_id, String dest_id){
        Plane plane = this.planes.get(id);
        
        if (!this.places.keySet().contains(dep_id)){
            this.places.put(dep_id, new Place(dep_id));
        }
        if (!this.places.keySet().contains(dest_id)){
            this.places.put(dest_id, new Place(dest_id));
        }
        
        Place dep_place = this.places.get(dep_id);
        Place dest_place = this.places.get(dest_id);
        Flight this_flight = new Flight(plane, dep_place, dest_place, plane.getCapacity());
        this.flights.put(this_flight.toString(), this_flight);
    }
    
    public void printPlanes(){
        for (Plane plane:this.planes.values()){
            System.out.println(plane);
        }
    }
    
    public void printFlights(){
        for (Flight flight:this.flights.values()){
            System.out.println(flight);
        }
        System.out.println();
    }
    
    public void printPlaneDetails(String id){
        System.out.println(this.planes.get(id));
        System.out.println();
    }
}
