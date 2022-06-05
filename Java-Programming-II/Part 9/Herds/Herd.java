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

public class Herd implements Movable{
    private ArrayList<Movable> herd;
    
    public Herd(){
        this.herd = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable){
        this.herd.add(movable);
    }
    
    public void move(int dx, int dy){
        for (Movable m:this.herd){
            m.move(dx, dy);
        }
    }
    
    public String toString(){
        String s = "";
        for (Movable m:this.herd){
            if (s.equals("")){
                s = m.toString();
            } else {
                s += "\n"+m.toString();
            }
        }
        return s;
    }
}
