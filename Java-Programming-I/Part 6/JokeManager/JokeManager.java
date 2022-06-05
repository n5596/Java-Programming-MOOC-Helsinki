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
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes;
    
    public JokeManager(){
        this.jokes = new ArrayList<>();
    }
    
    public void addJoke(String joke){
        this.jokes.add(joke);
    }
    
    public String drawJoke(){
        if (this.jokes.size() == 0){
            return "Jokes are in short supply.";
        }
        Random random = new Random();   
        int idx = random.nextInt(this.jokes.size());
        String joke = this.jokes.get(idx);
        System.out.println("Look here"+idx+joke);
        return joke;
    }
    
    public void printJokes(){
        for (String joke:this.jokes){
            System.out.println(joke);
        }
    }
}
