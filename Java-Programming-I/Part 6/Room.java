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

public class Room {
    private ArrayList<Person> persons;
    
    public Room(){
        this.persons = new ArrayList<>();
    }
    
    public void add(Person person){
        this.persons.add(person);
    }
    
    public boolean isEmpty(){
        if (this.persons.size() == 0){
            return true;
        }
        return false;
    }
    
    public ArrayList<Person> getPersons(){
        return this.persons;
    }
    
    public Person shortest(){
        if (this.persons.size() == 0){
            return null;
        }
        
        Person s = new Person("dummy", 100000);
        for (Person p:this.persons){
            if (s.getHeight() > p.getHeight()){
                s = p;
            }
        }
        return s;
    }
    
    public Person take(){
        Person s = this.shortest();
        this.persons.remove(s);
        return s;
    }
}
