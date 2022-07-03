package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;

public class GreeterApplication extends Application{

    public void start(Stage window) {
        VBox layout1 = new VBox();
        Button button1 = new Button("Start");
        Label label1 = new Label("Enter your name and start.");
        TextField tf1 = new TextField();
        
        layout1.getChildren().add(label1);
        layout1.getChildren().add(tf1);
        layout1.getChildren().add(button1);
                
        VBox layout2 = new VBox();
        Label label2 = new Label();
        
        layout2.getChildren().add(label2);
        
        Scene view1 = new Scene(layout1);
        Scene view2 = new Scene(layout2);
       
        button1.setOnAction((event) -> {window.setScene(view2);label2.setText("Welcome "+tf1.getText()+"!");});
        
        window.setScene(view1);
        window.show();
    }
    
    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }
}
