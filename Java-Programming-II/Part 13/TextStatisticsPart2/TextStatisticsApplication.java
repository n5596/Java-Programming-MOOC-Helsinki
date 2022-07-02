package textstatistics;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import java.util.Arrays;

public class TextStatisticsApplication extends Application{

    public void start(Stage window) {
        Label l1 = new Label("Letters: 0");
        Label l2 = new Label("Words: 0");
        Label l3 = new Label("The longest word is:");
        TextArea ta = new TextArea("");
        

        HBox buttons = new HBox();
        buttons.setSpacing(10);
        buttons.getChildren().add(l1);
        buttons.getChildren().add(l2);
        buttons.getChildren().add(l3);
        
        BorderPane componentGroup = new BorderPane();
        componentGroup.setCenter(ta);
        componentGroup.setBottom(buttons);

        ta.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                .sorted((s1, s2) -> s2.length() - s1.length())
                .findFirst()
                .get();
            
            l1.setText("Letters: "+characters);
            l2.setText("Words: "+words);
            l3.setText("The longest word is: "+ longest);
        });
        
        Scene view = new Scene(componentGroup);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}
