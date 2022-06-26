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

public class HashMap <K,V> {
    private ArrayList<KeyValue<K,V>>[] values;
    private int index;
    
    public HashMap(){
        this.values = new ArrayList[32];
        this.index = 0;
    }

    public V get(K key){
        int hashIdx = key.hashCode() % this.values.length;
        
        if (this.values[hashIdx] == null){
            return null;
        }

        for (int i=0; i<this.values[hashIdx].size(); i++){
            if (key.equals(this.values[hashIdx].get(i).getKey())){
                return this.values[hashIdx].get(i).getValue();
            }
        }
       return null;
    }
    
    private ArrayList<KeyValue<K, V>> getListBasedOnKey(K key) {
        int hashIdx = (key.hashCode() % this.values.length);
        if (this.values[hashIdx] == null){
            this.values[hashIdx] = new ArrayList<>();
        }
        return this.values[hashIdx];
    }
    
    private int getIndexOfKey(ArrayList<KeyValue<K, V>> myList, K key) {
        for (int i=0; i<myList.size(); i++){
            KeyValue pair = myList.get(i);
            if (key == pair.getKey() || key.equals(pair.getKey())){
                return i;
            }
        }
        return -1;
    }
        
    public void add(K key, V value){
        ArrayList<KeyValue<K, V>> myList = this.getListBasedOnKey(key);
        int idx = this.getIndexOfKey(myList, key);
        
        if (idx == -1){ // new key
            myList.add(new KeyValue(key, value));
            this.index += 1;
        } else {
            KeyValue<K, V> pair = myList.get(idx);
            pair.setValue(value);
            myList.set(idx, pair);
        }
        
        if (1.0 * this.index / this.values.length > 0.75) {
            this.grow();
        }
    }
    
    private void grow(){
        ArrayList<KeyValue<K, V>>[] newValues = new ArrayList[this.values.length * 2];
        
        for (int i=0; i<this.values.length; i++){
            this.copy(newValues, i);
        }
        this.values = newValues;
    }
    
    private void copy(ArrayList<KeyValue<K, V>>[] newArray, int fromIdx) {
        for (int i=0; i<this.values[fromIdx].size(); i++){
            KeyValue<K, V> pair = this.values[fromIdx].get(i);
            
            int hashIdx = (pair.getKey().hashCode() % newArray.length);
            if (newArray[hashIdx] == null){
                newArray[hashIdx] = new ArrayList<>();
            }
            
            newArray[hashIdx].add(pair);
        }
    }
    
    public V remove(K key){
        ArrayList<KeyValue<K, V>> myList = this.getListBasedOnKey(key);
        
        if (myList.size() == 0){
            return null;
        }
        
        int idx = this.getIndexOfKey(myList, key);
        KeyValue<K, V> pair = myList.get(idx);
        myList.remove(idx);
        return pair.getValue();
    }
}
