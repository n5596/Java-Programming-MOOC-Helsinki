/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naila
 */
public class Exercise {
    private String name;
    private boolean completed;
    
    public Exercise(String s){
        this.name = s;
        this.completed = false;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setCompleted(){
        this.completed = true;
    }
    
    public boolean isCompleted(){
        return this.completed;
    }
}
