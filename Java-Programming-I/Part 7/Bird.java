/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naila
 */
public class Bird {
    private String name;
    private String latin;
    private int observations;
    
    public Bird(String name, String latin){
        this.name = name;
        this.latin = latin;
        this.observations = 0;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void addObservation(){
        this.observations += 1;
    }
    
    public void printBird(){
        System.out.println(this.name + " ("+ this.latin + ") "+": "+this.observations+" observations");
        return;
    }
}
