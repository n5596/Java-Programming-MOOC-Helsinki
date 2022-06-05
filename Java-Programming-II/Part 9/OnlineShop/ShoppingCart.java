/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naila
 */
import java.util.Map;
import java.util.HashMap;

public class ShoppingCart {
    private Map<String, Item> products;
    
    public ShoppingCart(){
        this.products = new HashMap<>();
    }
    
    public void add(String product, int price){
        if (this.products.containsKey(product)){
            Item i = this.products.get(product);
            i.increaseQuantity();
            this.products.put(product, i);
        } else {
            this.products.put(product, new Item(product, 1, price));
        }
    }
    
    public int price(){
        int price = 0;
        for (Item i: this.products.values()){
            price += i.price();
        }
        return price;
    }
    
    public void print(){
        Item i;
        for (String s: this.products.keySet()){
            i = this.products.get(s);
            System.out.println(s+": "+i.quantity());
        }
    }
}
