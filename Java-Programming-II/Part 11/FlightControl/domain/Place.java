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
public class Place {
    private String id;
    
    public Place(String id){
        this.id = id;
    }
    
    public String getId(){
        return this.id;
    }
}
