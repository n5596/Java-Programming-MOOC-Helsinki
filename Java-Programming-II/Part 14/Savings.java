/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author naila
 */
import java.util.ArrayList;

public class Savings {
    private double yrate;
    private double msavings;
    
    public Savings(double msavings, double yrate){
        this.yrate = yrate;
        this.msavings = msavings;
    }
    
    public double getMonthlySavings(){
        return this.msavings;
    }
    
    public double getRate(){
        return this.yrate;
    }
    
    public void setRate(double yrate){
        this.yrate = yrate;
    }
    
    public void setMonthlySavings(double msavings){
        this.msavings = msavings;
    }
    
    public ArrayList<Double> withInterest(){
        ArrayList<Double> with = new ArrayList<>();
        with.add(0.0);
        
        double value = 0;
        for (int i=1; i<=30; i++){
            value = (value +this.msavings*12)*(1+(this.yrate/100));
            with.add(value);
        }
        return with;
    }
    
    public ArrayList<Double> withoutInterest(){
        ArrayList<Double> without = new ArrayList<>();
        without.add(0.0);
        
        double value;
        for (int i=1; i<=30; i++){
            value = this.msavings*12*i;
            without.add(value);
        }
        return without;        
    }
}
