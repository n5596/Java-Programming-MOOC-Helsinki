/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naila
 */
public class Timer {
    private ClockHand h_seconds;
    private ClockHand seconds;
    
    public Timer(){
        this.h_seconds = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }
    
    public String toString(){
        return this.seconds + ":" + this.h_seconds;
    }
    
    public void advance(){        
        if (this.h_seconds.value() == 99){
            this.seconds.advance();
        }
        this.h_seconds.advance();
    }
}
