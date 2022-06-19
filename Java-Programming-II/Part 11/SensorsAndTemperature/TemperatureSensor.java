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
import java.util.Random;

public class TemperatureSensor implements Sensor{
    private boolean sensor;
    
    public TemperatureSensor(){
        this.sensor = false;
    }
    
    public int read(){
        if (this.sensor){
            return new Random().nextInt(61)-30;
        }
        throw new IllegalStateException();
    }
    
    public boolean isOn(){
        return this.sensor;
    }
    
    public void setOn(){
        this.sensor = true;
    }
    
    public void setOff(){
        this.sensor = false;
    }
}
