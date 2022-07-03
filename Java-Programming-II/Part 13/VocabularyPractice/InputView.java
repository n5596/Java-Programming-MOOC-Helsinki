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
public class InputView {
    private Dictionary dictionary;
    
    public InputView(Dictionary dictionary){
        this.dictionary = dictionary;
    }
    
    public Parent getView(){
        GridPane layout = new GridPane();

        Label label1 = new Label("Word");
        TextField tf1 = new TextField();
        Label label2 = new Label("Translation");
        TextField tf2 = new TextField();

        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(10, 10, 10, 10));

        Button button1 = new Button("Add the word pair");

        layout.add(label1, 0, 0);
        layout.add(tf1, 0, 1);
        layout.add(label2, 0, 2);
        layout.add(tf2, 0, 3);
        layout.add(button1, 0, 4);

        button1.setOnMouseClicked((event) -> {
            String word = tf1.getText();
            String translation = tf2.getText();

            this.dictionary.add(word, translation);

            tf1.clear();
            tf2.clear();
        });

        return layout;        
    }
}
