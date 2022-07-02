package borderpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneApplication extends Application{

    public void start(Stage window) {
        Label l1 = new Label("NORTH");
        Label l2 = new Label("EAST");
        Label l3 = new Label("SOUTH");
        

        BorderPane componentGroup = new BorderPane();
        componentGroup.setTop(l1);
        componentGroup.setRight(l2);
        componentGroup.setBottom(l3);

        Scene view = new Scene(componentGroup);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(BorderPaneApplication.class);
    }

}
