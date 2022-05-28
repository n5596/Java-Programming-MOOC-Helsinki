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

public class ChangeHistory {
    private ArrayList<Double> history;
    
    public ChangeHistory(){
        this.history = new ArrayList<>();
    }
    
    public void add(double status){
        this.history.add(status);
    }
    
    public void clear(){
        this.history.clear();
    }
    
    public String toString(){
        return this.history.toString();
    }
    
    public double maxValue(){
        double max = 0.0;
        for (double d:this.history){
            if (d > max){
                max = d;
            }
        }
        return max;
    }
    
    public double minValue(){
        if (this.history.size() == 0){
            return 0.0;
        }
        
        double min = 10000.0;
        for (double d: this.history){
            if (d < min){
                min = d;
            }
        }
        return min;
    }
    
    public double average(){
        double sum = 0.0;
        
        for (double d: this.history){
            sum += d;
        }
        return sum/this.history.size();
    }
}
