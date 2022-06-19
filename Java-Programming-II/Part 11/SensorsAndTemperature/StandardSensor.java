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
public class StandardSensor implements Sensor{
    private int number;
    
    public StandardSensor(int number){
        this.number = number;
    }
    
    public boolean isOn(){
        return true;
    }
    
    public void setOn(){
        return;
    }
    
    public void setOff(){
        return;
    }
    
    public int read(){
        return this.number;
    }
}
