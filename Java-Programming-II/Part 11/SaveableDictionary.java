/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

/**
 *
 * @author naila
 */
import java.util.HashMap;
import java.util.Scanner;
import java.nio.file.Paths;
import java.io.PrintWriter;
import java.util.ArrayList;

public class SaveableDictionary {
    private String file;
    private HashMap<String, String> translations;
    
    public SaveableDictionary(){
        this.translations = new HashMap<>();
    }
    public SaveableDictionary(String file){
        this();
        this.file = file;
    }
    
    public void add(String words, String translation){
        if (this.translations.keySet().contains(words)){
            return;
        }
        this.translations.put(words, translation);
        this.translations.put(translation, words);
    }
    
    public String translate(String word){
        if (!this.translations.keySet().contains(word)){
            return null;
        }
        return this.translations.get(word);
    }
    
    public void delete(String word){
        if (this.translations.keySet().contains(word)){
            String translate = this.translations.get(word);
            this.translations.remove(word);
            this.translations.remove(translate);
        }
    }
    
    public boolean load(){
        try{
            Scanner scanner = new Scanner(Paths.get(this.file));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] words = line.split(":");
                this.add(words[0], words[1]);
            }
            return true;
        } catch (Exception e){
            return false;
        }
    }
    
    public boolean save(){
        try{
            PrintWriter writer = new PrintWriter(this.file);
            ArrayList<String> saved = new ArrayList<>();
            
            for (String key:this.translations.keySet()){
                if (saved.contains(key)){
                    continue;
                }
                String string = key +":"+this.translations.get(key);
                saved.add(key);
                saved.add(this.translations.get(key));
                writer.println(string);
            }
            writer.close();
            return true;
        } catch (Exception e){
            return false;
        }
    }
}
