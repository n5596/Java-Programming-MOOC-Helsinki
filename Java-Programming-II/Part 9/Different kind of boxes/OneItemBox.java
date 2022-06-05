/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naila
 */
public class OneItemBox extends Box{
    private Item item;
    
    public OneItemBox(){
        this.item = null;
    }
    
    public void add(Item i){
        if (this.item == null){
            this.item = i;
        }
    }
    
    public boolean isInBox(Item i){
        if (this.item == null){
            return false;
        }
        if (this.item.equals(i)){
            return true;
        }
        return false;
    }
}
