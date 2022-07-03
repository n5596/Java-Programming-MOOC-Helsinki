/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author naila
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Dictionary {
    private ArrayList<String> words;
    private HashMap<String, String> translations;
    
    public Dictionary(){
        this.words = new ArrayList<>();
        this.translations = new HashMap<>();
    }
    
    public void add(String word, String translation){
        if (!this.translations.keySet().contains(word)){
            this.words.add(word);
            this.translations.put(word, translation);
        }
    }
    
    public String get(String word){
        return this.translations.get(word);
    }
    
    public String getRandomWord(){
        Random random = new Random();
        int idx = random.nextInt(this.words.size());
        return this.words.get(idx);
    }
}
