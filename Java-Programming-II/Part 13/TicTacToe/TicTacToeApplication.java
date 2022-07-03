package ticTacToe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;

public class TicTacToeApplication extends Application{

    public void start(Stage window) {
        TicTacToe game = new TicTacToe();
        BorderPane layout = new BorderPane();
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setHgap(10);
        grid.setVgap(10);
        
        Label label = new Label("Turn: X");
        Button button1 = new Button();
        Button button2 = new Button();
        Button button3 = new Button();
        Button button4 = new Button();
        Button button5 = new Button();
        Button button6 = new Button();
        Button button7 = new Button();
        Button button8 = new Button();
        Button button9 = new Button();
        
        grid.add(button1, 0, 0);
        grid.add(button2, 0, 1);
        grid.add(button3, 0, 2);
        grid.add(button4, 1, 0);
        grid.add(button5, 1, 1);
        grid.add(button6, 1, 2);
        grid.add(button7, 2, 0);
        grid.add(button8, 2, 1);
        grid.add(button9,2, 2);
        
        layout.setTop(label);
        layout.setCenter(grid);
       
        button1.setOnAction((event) -> {
            if (button1.getText().equals("")){                
                button1.setText(game.getPlayer()); 
                game.move(0, 0);
                if (!game.getStatus().equals("finished")){
                    label.setText("Turn: "+game.getPlayer());
                } else {
                    label.setText("The end!");
                }               
            }            
        });
        
        button2.setOnAction((event) -> {
            if (button2.getText().equals("")){     
                button2.setText(game.getPlayer()); 
                game.move(0, 1);
                if (!game.getStatus().equals("finished")){
                    label.setText("Turn: "+game.getPlayer());
                } else {
                    label.setText("The end!");
                }               
            }            
        });

        button3.setOnAction((event) -> {
            if (button3.getText().equals("")){                
                button3.setText(game.getPlayer()); 
                game.move(0, 2);
                if (!game.getStatus().equals("finished")){
                    label.setText("Turn: "+game.getPlayer());
                } else {
                    label.setText("The end!");
                }               
            }            
        });
        
        button4.setOnAction((event) -> {
            if (button4.getText().equals("")){                
                button4.setText(game.getPlayer()); 
                game.move(1, 0);
                if (!game.getStatus().equals("finished")){
                    label.setText("Turn: "+game.getPlayer());
                } else {
                    label.setText("The end!");
                }               
            }            
        });
        
        button5.setOnAction((event) -> {
            if (button5.getText().equals("")){                
                button5.setText(game.getPlayer()); 
                game.move(1, 1);
                if (!game.getStatus().equals("finished")){
                    label.setText("Turn: "+game.getPlayer());
                } else {
                    label.setText("The end!");
                }               
            }            
        });
        
        button6.setOnAction((event) -> {
            if (button6.getText().equals("")){                
                button6.setText(game.getPlayer()); 
                game.move(1, 2);
                if (!game.getStatus().equals("finished")){
                    label.setText("Turn: "+game.getPlayer());
                } else {
                    label.setText("The end!");
                }               
            }            
        });
        
        button7.setOnAction((event) -> {
            if (button7.getText().equals("")){                
                button7.setText(game.getPlayer()); 
                game.move(2, 0);
                if (!game.getStatus().equals("finished")){
                    label.setText("Turn: "+game.getPlayer());
                } else {
                    label.setText("The end!");
                }               
            }            
        });
        
        button8.setOnAction((event) -> {
            if (button8.getText().equals("")){                
                button8.setText(game.getPlayer()); 
                game.move(2, 1);
                if (!game.getStatus().equals("finished")){
                    label.setText("Turn: "+game.getPlayer());
                } else {
                    label.setText("The end!");
                }               
            }            
        });
        
        button9.setOnAction((event) -> {
            if (button9.getText().equals("")){                
                button9.setText(game.getPlayer()); 
                game.move(2, 2);
                if (!game.getStatus().equals("finished")){
                    label.setText("Turn: "+game.getPlayer());
                } else {
                    label.setText("The end!");
                }               
            }            
        });
        
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();
    }
    
    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }

}
