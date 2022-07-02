package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;


public class NotifierApplication extends Application{

    public void start(Stage window) {
        TextField tf = new TextField();
        Button button = new Button("Update");
        Label label = new Label();
        
        VBox box = new VBox();
        box.setSpacing(10);
        box.getChildren().add(tf);
        box.getChildren().add(button);
        box.getChildren().add(label);
        
        button.setOnAction((event) -> {label.setText(tf.getText());});

        Scene view = new Scene(box);

        window.setScene(view);
        window.show();
    }
    
    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

}
