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
import java.util.Collections;

public class Hand implements Comparable<Hand>{
    private ArrayList<Card> cards;
    
    public Hand(){
        this.cards = new ArrayList<>();
    }
    
    public int sumOfHand(){
        int sum = 0;
        for (Card c: this.cards){
            sum += c.getValue();
        }
        return sum;
    }
    
    public void add(Card card){
        this.cards.add(card);
    }
    
    public void print(){
        for (Card c: this.cards){
            System.out.println(c);
        }
    }
    
    public void sort(){
        Collections.sort(this.cards);
    }
 
    @Override
    public int compareTo(Hand other){
        return this.sumOfHand()-other.sumOfHand();
    }
    
    public void sortBySuit(){
        BySuitInValueOrder sort_obj = new BySuitInValueOrder();
        Collections.sort(this.cards, sort_obj);
    }
}
