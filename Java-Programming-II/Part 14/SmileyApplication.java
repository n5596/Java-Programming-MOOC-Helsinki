package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.event.EventHandler;

import javafx.scene.paint.Color;
import javafx.scene.input.MouseEvent;

public class SmileyApplication extends Application{

    public void start(Stage window) {

        Canvas paintingCanvas = new Canvas(640, 480);
        GraphicsContext painter = paintingCanvas.getGraphicsContext2D();

        BorderPane paintingLayout = new BorderPane();
        paintingLayout.setCenter(paintingCanvas);
        
        painter.setFill(Color.BLACK);
        painter.fillRect(250, 100, 20, 20);
        painter.fillRect(450, 100, 20, 20);
        painter.fillRect(250, 220, 220, 20);
        painter.fillRect(230, 200, 20, 20);
        painter.fillRect(470, 200, 20, 20);

        paintingCanvas.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                double xLocation = event.getX();
                double yLocation = event.getY();
                painter.setFill(Color.BLACK);
                painter.fillOval(xLocation, yLocation, 4, 4);
            }
        });

        Scene view = new Scene(paintingLayout);

        window.setScene(view);
        window.show();
    }
    
    public static void main(String[] args) {
        launch(SmileyApplication.class);
    }

}
