/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naila
 */
public class List<T> {
    private T[] objs;
    private int idx;
    
    public List(){
        this.objs = (T[]) new Object[10];
        this.idx = 0;
    }
    
    public void add(T value){
        if (this.idx == this.objs.length){
            this.grow();
        }
        this.objs[this.idx] = value;
        this.idx += 1;
    }
    
    public void grow(){
        int new_size = this.objs.length + this.objs.length/2;
        T[] new_objs = (T[]) new Object[new_size];
        
        for (int i=0; i<this.objs.length; i++){
            new_objs[i] = this.objs[i];
        }
        
        this.objs = new_objs;
    }
    
    public int indexOfValue(T value){
        for (int i=0; i<this.objs.length; i++){
            if (this.objs[i] == value || this.objs[i].equals(value)){
                return i;
            }
        }
        return -1;
    }
    
    public boolean contains(T value){
        return this.indexOfValue(value) >= 0;
    }
    
    public void remove(T value){
        int find_idx = this.indexOfValue(value);
        this.moveLeft(find_idx);
    }
    
    public void moveLeft(int index){
        for (int i=index; i<this.idx-1; i++){
            this.objs[i] = this.objs[i+1];
        }
    }
    
    public T value(int index){
        if (index < 0 || index >= this.idx){
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.idx + "]");
        }
        return this.objs[index];
    }
    
    public int size(){
        return this.idx;
    }
}
