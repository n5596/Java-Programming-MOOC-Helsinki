package collage;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CollageApplication extends Application {

    @Override
    public void start(Stage stage) {

        // the example opens the image, creates a new image, and copies the opened image
        // into the new one, pixel by pixel
        Image sourceImage = new Image("file:monalisa.png");

        PixelReader imageReader = sourceImage.getPixelReader();

        int width = (int) sourceImage.getWidth();
        int height = (int) sourceImage.getHeight();

        WritableImage targetImage = new WritableImage(width, height);
        PixelWriter imageWriter = targetImage.getPixelWriter();

        int yCoordinate = 0;
        while (yCoordinate < height) {
            int xCoordinate = 0;
            while (xCoordinate < width) {

                Color color = imageReader.getColor(xCoordinate, yCoordinate);
                double red = color.getRed();
                double green = color.getGreen();
                double blue = color.getBlue();
                double opacity = color.getOpacity();
                
                red = 1.0-red;
                blue = 1.0-blue;
                green = 1.0-green;

                Color newColor = new Color(red, green, blue, opacity);

                imageWriter.setColor(xCoordinate/2, yCoordinate/2, newColor);
                imageWriter.setColor(xCoordinate/2+width/2, yCoordinate/2, newColor);
                imageWriter.setColor(xCoordinate/2, yCoordinate/2+height/2, newColor);
                imageWriter.setColor(xCoordinate/2+width/2, yCoordinate/2+height/2, newColor);

                xCoordinate += 2; // had to increment by 2 instead of 1 since the value was copied from the odd cell
            }

            yCoordinate += 2;
        }

        ImageView image = new ImageView(targetImage);

        Pane pane = new Pane();
        pane.getChildren().add(image);

        stage.setScene(new Scene(pane));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
