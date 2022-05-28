/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naila
 */
public class Student extends Person{
    private int study_credits;
    
    public Student(String name, String address){
        super(name, address);
        this.study_credits = 0;
    }
    
    public int credits(){
        return this.study_credits;
    }
    
    public void study(){
        this.study_credits += 1;
    }
    
    public String toString(){
        return super.toString() + "\n  Study credits "+this.study_credits;
    }
}
