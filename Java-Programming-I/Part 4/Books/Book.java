/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naila
 */
public class Book {
    private String name;
    private int pages;
    private int year;
    
    public Book(String name, int pages, int year){
        this.name=  name;
        this.pages = pages;
        this.year = year;
    }
    
    public String getName(){
        return this.name;
    }
    public int getPages(){
        return this.pages;
    }
    public int getYear(){
        return this.year;
    }
}
