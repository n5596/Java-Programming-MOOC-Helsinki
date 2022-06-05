/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naila
 */
public class Fitbyte {
    private int age;
    private int resting_hr;
    
    public Fitbyte(int age, int resting_hr){
        this.age = age;
        this.resting_hr = resting_hr;
    }
    
    public double targetHeartRate(double percentageOfMaximum){
        double max_hr = 206.3 - (0.711 * this.age);
        return (max_hr-this.resting_hr)*percentageOfMaximum + this.resting_hr;
    }
    
}
