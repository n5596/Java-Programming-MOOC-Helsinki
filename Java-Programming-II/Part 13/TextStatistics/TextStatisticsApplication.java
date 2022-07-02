package textstatistics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;

public class TextStatisticsApplication extends Application{

    public void start(Stage window) {
        Label l1 = new Label("Letters: 0");
        Label l2 = new Label("Words: 0");
        Label l3 = new Label("The longest word is:");
        

        HBox buttons = new HBox();
        buttons.setSpacing(10);
        buttons.getChildren().add(l1);
        buttons.getChildren().add(l2);
        buttons.getChildren().add(l3);
        
        BorderPane componentGroup = new BorderPane();
        componentGroup.setCenter(new TextArea(""));
        componentGroup.setBottom(buttons);

        Scene view = new Scene(componentGroup);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}
