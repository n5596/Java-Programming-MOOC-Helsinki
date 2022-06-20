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
public class Pipe<T> {
    private ArrayList<T> stack;
    
    public Pipe(){
        this.stack = new ArrayList<>();
    }
    
    public void putIntoPipe(T value){
        this.stack.add(value);
    }
    
    public T takeFromPipe(){
        if (this.isInPipe() == false){
            return null;
        }
        T to_return = this.stack.get(0);
        this.stack.remove(0);
        return to_return;
    }
    
    public boolean isInPipe(){
        if (this.stack.size() == 0){
            return false;
        }
        return true;
    }
}
