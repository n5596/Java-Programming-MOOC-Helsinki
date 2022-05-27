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
import java.util.ArrayList;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;
    
    public StorageFacility(){
        this.storage = new HashMap<>();
    }
    
    public void add(String unit, String item){
        if (!this.storage.keySet().contains(unit)){
            this.storage.put(unit, new ArrayList<>());
        }
        this.storage.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit){
        if (!this.storage.keySet().contains(storageUnit)){
            return new ArrayList<>();
        }
        return this.storage.get(storageUnit);
    }
    
    public void remove(String storageUnit, String item){
        ArrayList<String> items = this.storage.get(storageUnit);
        items.remove(item);
        if (items.size() == 0){
            this.storage.remove(storageUnit);
        } else {
            this.storage.put(storageUnit, items);
        } 
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> storage_names = new ArrayList<>();
        
        for (String key:this.storage.keySet()){
            storage_names.add(key);
        }
        return storage_names;
    }
}
