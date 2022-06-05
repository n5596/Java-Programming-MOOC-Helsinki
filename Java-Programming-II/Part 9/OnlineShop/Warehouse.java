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
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> prices;
    private Map<String, Integer> stocks;
    
    public Warehouse(){
        this.prices = new HashMap<>();
        this.stocks = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock){
        this.prices.put(product, price);
        this.stocks.put(product, stock);
    }
    
    public int price(String product){
        if (this.prices.keySet().contains(product)){
            return this.prices.get(product);
        }
        return -99;
    }
    
    public int stock(String product){
        if (this.stocks.keySet().contains(product)){
            return this.stocks.get(product);
        }
        return 0;
    }
    
    public boolean take(String product){
        int current_stock = this.stock(product);
        if (current_stock > 0){
            this.stocks.put(product, current_stock-1);
            return true;
        }
        return false;
    }
    
    public Set<String> products(){
        Set products = this.prices.keySet();
        return products;
    }
}
