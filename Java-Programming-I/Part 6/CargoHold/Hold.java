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

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> hold;
    private int total;
    
    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
        this.hold = new ArrayList<>();
        this.total = 0;
    }
    
    public void addSuitcase(Suitcase suitcase){
        if (this.total + suitcase.totalWeight() > this.maxWeight){
            return;
        }
        this.hold.add(suitcase);
        this.total += suitcase.totalWeight();
    }
    
    public String toString(){
        return this.hold.size() + " suitcases (" + this.total+" kg)";
    }
    
    public void printItems(){
        for (Suitcase s:this.hold){
            s.printItems();
        }
    }
}

