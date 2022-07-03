/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 *
 * @author naila
 */
public class PracticeView {
    private Dictionary dictionary;
    private String word;
    
    public PracticeView(Dictionary dictionary){
        this.dictionary = dictionary;
        this.word = this.dictionary.getRandomWord();
    }
    
    public Parent getView(){
        GridPane layout = new GridPane();

        Label label1 = new Label("Translate the word '"+this.word+"'");
        TextField tf1 = new TextField();
        Label label2 = new Label();

        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(10, 10, 10, 10));

        Button button1 = new Button("Check");

        layout.add(label1, 0, 0);
        layout.add(tf1, 0, 1);
        layout.add(button1, 0, 2);
        layout.add(label2, 0, 3);

        button1.setOnMouseClicked((event) -> {
            String translation = tf1.getText();

            if (translation.equals(this.dictionary.get(this.word))){
                label2.setText("Correct!");
            } else {
                label2.setText("Incorrect! The translation fo the word '" + this.word + "' is '" + this.dictionary.get(word) + "'.");
            }

            this.word = this.dictionary.getRandomWord();
            label1.setText("Translate the word '" + this.word + "'");
            tf1.clear();
        });

        return layout;        
    }    
}
