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

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    private int total;
    
    public Suitcase(int maxWeight){
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
        this.total = 0;
    }
    
    public void addItem(Item item){
        if (item.getWeight()+this.total > this.maxWeight){
            return;
        }
        this.items.add(item);
        this.total += item.getWeight();
    }
    
    public String toString(){
        if (this.items.size() == 0){
            return "no items (0 kg)";
        } else if (this.items.size() == 1){
            return items.size()+" item ("+this.total+" kg)";
        }
        return items.size()+" items ("+this.total+" kg)";
    }
    
    public void printItems(){
        for (Item i:this.items){
            System.out.println(i);
        }
    }
    
    public int totalWeight(){
        return this.total;
    }
    
    public Item heaviestItem(){
        if (this.items.size() == 0){
            return null;
        }
        
        Item heavy = new Item("dummy", -1);
        for (Item i:this.items){
            if (i.getWeight() > heavy.getWeight()){
                heavy = i;
            }
        }
        return heavy;
    }
}
