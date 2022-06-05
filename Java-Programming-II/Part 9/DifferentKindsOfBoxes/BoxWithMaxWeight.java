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

public class BoxWithMaxWeight extends Box{
    private int capacity;
    private ArrayList<Item> items;
    
    public BoxWithMaxWeight(int capacity){O
        super();
        this.items = new ArrayList<>();
        this.capacity = capacity;
    }
    
    public int getTotalWeight(){
        int weight = 0;
        for (Item i:this.items){
            weight += i.getWeight();
        }
        return weight;
    }
    
    @Override
    public void add(Item i){
        if (i.getWeight()+this.getTotalWeight() <= this.capacity){
            this.items.add(i);
        }
    }
    
    public boolean isInBox(Item i){
        if (this.items.contains(i)){
            return true;
        }
        return false;
    }
}
