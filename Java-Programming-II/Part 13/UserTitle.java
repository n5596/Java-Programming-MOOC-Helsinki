package title;

import javafx.application.Application;
import javafx.stage.Stage;

public class UserTitle extends Application{

    public void start(Stage window) {
        Parameters params = getParameters();
        String title = params.getNamed().get("title");
        
        window.setTitle(title);
        window.show();
    }
}
