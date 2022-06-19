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
import java.util.List;

public class AverageSensor implements Sensor{
    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> reads;
 
    public AverageSensor(){
        this.sensors = new ArrayList<>();
        this.reads = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd){
        this.sensors.add(toAdd);
    }
    
    public void setOn(){
        for (Sensor s:this.sensors){
            s.setOn();
        }
    }
    
    public void setOff(){
        this.sensors.get(0).setOff();
    }
    
    public boolean isOn(){
        for (Sensor s:this.sensors){
            if (!s.isOn()){
                return false;
            }
        }
        return true;
    }
    
    public int read(){
        if (this.isOn() == false || this.sensors.size() == 0){
            throw new IllegalStateException("AverageSensor is off or no sensors have been added to it");
        }
        
        int sum = 0;
        for (Sensor s:this.sensors){
            sum += s.read();
        }
        
        int avg = (int) sum/this.sensors.size();
        System.out.println("Avg is "+avg);
        this.reads.add(avg);
        return avg;
    }   
    
    public List<Integer> readings(){
        return this.reads;
    }
}