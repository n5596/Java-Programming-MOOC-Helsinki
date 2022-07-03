package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public class ShanghaiApplication extends Application{

    public void start(Stage window) {
        NumberAxis xAxis = new NumberAxis(2007, 2017, 1);
        NumberAxis yAxis = new NumberAxis();    
        
        xAxis.setLabel("Year");
        yAxis.setLabel("Rank");
        
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Rank obtained by the University of Helenski in the years 2007-2017");

        XYChart.Series data = new XYChart.Series();
        data.setName("UoH");
        data.getData().add(new XYChart.Data(2007, 73));
        data.getData().add(new XYChart.Data(2008, 68));
        data.getData().add(new XYChart.Data(2009, 72));
        data.getData().add(new XYChart.Data(2010, 72));
        data.getData().add(new XYChart.Data(2011, 74));
        data.getData().add(new XYChart.Data(2012, 73));
        data.getData().add(new XYChart.Data(2013, 76));
        data.getData().add(new XYChart.Data(2014, 73));
        data.getData().add(new XYChart.Data(2015, 67));
        data.getData().add(new XYChart.Data(2016, 56));
        data.getData().add(new XYChart.Data(2017, 56));
        
        lineChart.getData().add(data);

        Scene view = new Scene(lineChart, 640, 480);
        window.setScene(view);
        window.show();
    }
    
    public static void main(String[] args) {
        launch(ShanghaiApplication.class);
    }

}
