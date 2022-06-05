/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naila
 */
import java.util.ArrayList;

public class Box implements Packable{
    private ArrayList<Packable> items;
    private double capacity;
    
    public Box(double capacity){
        this.items = new ArrayList<>();
        this.capacity = capacity;
    }
    
    public double weight(){
        double weight = 0.0;
        for (Packable p:this.items){
            weight += p.weight();
        }
        return weight;
    }
    
    public void add(Packable p){
        if (p.weight()+this.weight() <= this.capacity){
            this.items.add(p);
        }
    }
    
    public String toString(){
        return "Box: "+this.items.size()+" items, total weight "+this.weight()+" kg";
    }
}
