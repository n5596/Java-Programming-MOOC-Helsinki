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

public class ExerciseManagement {
    private ArrayList<Exercise> exercises;
    
    public ExerciseManagement(){  
        this.exercises = new ArrayList();
    }
    
    public ArrayList<String> exerciseList(){
        ArrayList<String> list = new ArrayList();
        for (Exercise e:this.exercises){
            list.add(e.getName());
        }
        return list;
    }
    
    public void add(String s){
        this.exercises.add(new Exercise(s));
    }
    
    public void markAsCompleted(String s){
        for (Exercise e:this.exercises){
            if (e.getName().equals(s)){
                e.setCompleted();
            }
        }
    }
    
    public boolean isCompleted(String s){
        for (Exercise e:this.exercises){
            if (e.getName().equals(s)){
                return e.isCompleted();
            }
        }
        return false;
    }
}
