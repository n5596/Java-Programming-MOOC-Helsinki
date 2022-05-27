/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naila
 */
import java.util.HashMap;
import java.util.ArrayList;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dictionary;
    
    public DictionaryOfManyTranslations(){
        this.dictionary = new HashMap<>();
    }
    
    public void add(String word, String translation){
        if (this.dictionary.keySet().contains(word)){
            this.dictionary.get(word).add(translation);
        } else {
            this.dictionary.put(word, new ArrayList<>());
            this.dictionary.get(word).add(translation);
        }
    }
    
    public ArrayList<String> translate(String word){
        if (this.dictionary.keySet().contains(word)){
            return this.dictionary.get(word);
        }
        return new ArrayList<>();
    }
    
    public void remove(String word){
        this.dictionary.remove(word);
    }
}
