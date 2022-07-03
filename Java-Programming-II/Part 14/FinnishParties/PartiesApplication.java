package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

import java.util.Scanner;
import java.nio.file.Paths;

public class PartiesApplication extends Application{

    public void start(Stage window) {
        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis();    
        
        xAxis.setLabel("Year");
        yAxis.setLabel("Support");
        
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support for the major Finnish parties during the years 2007-2017");

        try (Scanner scanner = new Scanner(Paths.get("partiesdata.tsv"))) {
            int flag = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split("\t");
                
                if (flag == 0){
                    flag = 1;
                    continue;
                }
                
                System.out.println(line);
                XYChart.Series data = new XYChart.Series();
                data.setName(parts[0]);
                
                int year = 1968;
                for (int i=1; i<parts.length; i++){
                    if (parts[i].equals("-")){
                        year += 4;
                        continue;
                    }
                    data.getData().add(new XYChart.Data(year, Double.valueOf(parts[i])));
                    year += 4;
                }
                lineChart.getData().add(data);

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        Scene view = new Scene(lineChart, 640, 480);
        window.setScene(view);
        window.show();
    }
    
    public static void main(String[] args) {
        launch(PartiesApplication.class);
    }

}
