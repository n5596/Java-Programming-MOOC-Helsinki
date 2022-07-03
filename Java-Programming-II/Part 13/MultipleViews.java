package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;

public class MultipleViews extends Application{

    public void start(Stage window) {
        BorderPane layout1 = new BorderPane();
        Button button1 = new Button("To the second view!");
        Label label1 = new Label("First view!");
        
        layout1.setTop(label1);
        layout1.setCenter(button1);
                
        VBox layout2 = new VBox();
        Button button2 = new Button("To the third view!");
        Label label2 = new Label("Second view!");
        
        layout2.getChildren().add(button2);
        layout2.getChildren().add(label2);
        
        GridPane layout3 = new GridPane();
        Button button3 = new Button("To the first view!");
        Label label3 = new Label("Third view!");
        
        layout3.add(label3, 0, 0);
        layout3.add(button3, 1, 1);

        Scene view1 = new Scene(layout1);
        Scene view2 = new Scene(layout2);
        Scene view3 = new Scene(layout3);
       
        button1.setOnAction((event) -> {window.setScene(view2);});
        button2.setOnAction((event) -> {window.setScene(view3);});
        button3.setOnAction((event) -> {window.setScene(view1);});
        
        window.setScene(view1);
        window.show();
    }
        
    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

}
