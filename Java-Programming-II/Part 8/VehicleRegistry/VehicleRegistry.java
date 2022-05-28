/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naila
 */
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> hashmap;
    
    public VehicleRegistry(){
        this.hashmap = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner){
        if (this.hashmap.containsKey(licensePlate)){
            return false;
        }
        this.hashmap.put(licensePlate, owner);
        return true;
    }
    
    public String get(LicensePlate licensePlate){
        return this.hashmap.getOrDefault(licensePlate, null);
    }
    
    public boolean remove(LicensePlate licensePlate){
        if (!this.hashmap.containsKey(licensePlate)){
            return false;
        }
        this.hashmap.remove(licensePlate);
        return true;
    }
    
    public void printLicensePlates(){
        for (LicensePlate lp:this.hashmap.keySet()){
            System.out.println(lp);
        }
    }
    
    public void printOwners(){
        HashMap<String, Integer> unique = new HashMap<>();
        
        for (String owner:this.hashmap.values()){
            if (!this.hashmap.containsKey(owner)){
                unique.put(owner, 1);
            }
        }
        
        for (String owner:unique.keySet()){
            System.out.println(owner);
        }
    }
}
