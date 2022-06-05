/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naila
 */
public class Archive {
    public String id;
    public String name;
    
    public Archive(String id, String name){
        this.id = id;
        this.name = name;
    }
    
    public String getId(){
        return this.id;
    }
    
    public String getName(){
        return this.name;
    }
    
    public boolean equals(Object compared){
        if (this.getClass() != compared.getClass()){
            return false;
        }
        Archive a = (Archive) compared;
        if (this.id.equals(a.id)){
            return true;
        }
        return false;
    }
}
