/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naila
 */
public class CD implements Packable{
    private String artist;
    private String name;
    private int year;
    
    public CD(String artist, String name, int year){
        this.artist = artist;
        this.name = name;
        this.year = year;
    }
    
    public String toString(){
        return this.artist + ": "+this.name + " (" + this.year +")";
    }
    
    public double weight(){
        return 0.1;
    }
}
