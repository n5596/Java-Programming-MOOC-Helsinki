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
    private String author;
    private String title;
    private int page_count;
    
    public Book(String author, String name, int pages){
        this.author = author;
        this.title = name;
        this.page_count = pages;
    }
    
    public String getAuthor(){
        return this.author;
    }
    
    public String getName(){
        return this.title;
    }
    
    public int getPages(){
        return this.page_count;
    }
    
    public String toString(){
        return this.author + ", "+ this.title + ", "+ this.page_count + " pages";
    }
}
