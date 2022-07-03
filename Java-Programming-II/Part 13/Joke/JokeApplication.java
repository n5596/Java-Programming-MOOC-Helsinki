package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;

public class JokeApplication extends Application{

    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        HBox menu = new HBox();   
        
        Button button1 = new Button("Joke");
        Button button2 = new Button("Answer");
        Button button3 = new Button("Explanation");
        Label label = new Label("What do you call a bear with no teeth?");
        
        menu.getChildren().add(button1);
        menu.getChildren().add(button2);
        menu.getChildren().add(button3);
        menu.getChildren().add(label);
        layout.setTop(menu);

        StackPane layout1 = createView("First view");
        StackPane layout2 = createView("Second view");
        StackPane layout3 = createView("Third view");
 
       
        button1.setOnAction((event) -> {layout.setCenter(layout1);label.setText("What do you call a bear with no teeth?");});
        button2.setOnAction((event) -> {layout.setCenter(layout2);label.setText("A gummy bear.");});
        button3.setOnAction((event) -> {layout.setCenter(layout3);label.setText("Gummy bears refer to the candy and gummy also means that a person has no teeth");});
        
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();
    }
    
    private StackPane createView(String text) {

        StackPane layout = new StackPane();
        layout.setPrefSize(300, 180);
        layout.getChildren().add(new Label(text));

        return layout;
    }    
    
    public static void main(String[] args) {
        launch(JokeApplication.class);
    }
}
