package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Slider;
import javafx.scene.control.Label;

import java.util.ArrayList;

public class SavingsCalculatorApplication extends Application{

    public void start(Stage window) {
        Savings saving = new Savings(25.0, 0.0);
        
        BorderPane layout = new BorderPane();
        VBox vbox = new VBox();
        
        BorderPane b1 = new BorderPane();
        Label l1 = new Label("Monthly savings");
        Slider s1 = new Slider();
        s1.setMin(25);
        s1.setMax(250);
        s1.setSnapToTicks(true);
        s1.setBlockIncrement(500);
        s1.setShowTickMarks(true);
        s1.setShowTickLabels(true);
        Label l2 = new Label();   
        b1.setRight(l2);
        b1.setCenter(s1);
        b1.setLeft(l1);
        
        BorderPane b2 = new BorderPane();
        Label l3 = new Label("Yearly interest rate");
        Slider s2 = new Slider();
        s2.setMin(0);
        s2.setMax(10);
        s2.setMinorTickCount(10);
        s2.setShowTickMarks(true);
        s2.setShowTickLabels(true);
        Label l4 = new Label();
        b2.setRight(l4);
        b2.setCenter(s2);
        b2.setLeft(l3);
        
        vbox.getChildren().add(b1);
        vbox.getChildren().add(b2);
        LineChart lineChart = this.getChart(saving.withInterest(), saving.withoutInterest());
        layout.setTop(vbox);
        layout.setCenter(lineChart);

        s1.valueProperty().addListener((change, oldValue, newValue) -> {
            double msavings = Math.round(s1.getValue());
            l2.setText(""+msavings);
            saving.setMonthlySavings(msavings);
            LineChart lc = this.getChart(saving.withInterest(), saving.withoutInterest());
            layout.setCenter(lc);
        });
        
        s2.valueProperty().addListener((change, oldValue, newValue) -> {
            double yrate = Math.round(s2.getValue());
            l4.setText(""+yrate);
            saving.setRate(yrate);
            LineChart lc = this.getChart(saving.withInterest(), saving.withoutInterest());
            layout.setCenter(lc);
        });  
        
        Scene view = new Scene(layout);
        window.setScene(view);
        window.show();
    }

    public LineChart getChart(ArrayList<Double> with, ArrayList<Double> without){
                
        NumberAxis xAxis = new NumberAxis(0, 30, 3);
        NumberAxis yAxis = new NumberAxis();    
        
        xAxis.setLabel("Years later");
        yAxis.setLabel("Savings");
        
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Yearly savings calculated using the monthly savings and interest rate");

        double value;
        XYChart.Series no_interest = new XYChart.Series();
        no_interest.getData().add(new XYChart.Data(0, 0));            
        no_interest.setName("Without Interest");
        
        for (int i=1; i<=30; i++){
            value = without.get(i);          
            no_interest.getData().add(new XYChart.Data(i, value));  
        }
        lineChart.getData().add(no_interest);
        XYChart.Series data = new XYChart.Series();
        data.getData().add(new XYChart.Data(0, 0));      
        data.setName("With Interest");
  
        for (int i=1; i<=30; i++){
            value = with.get(i);
            data.getData().add(new XYChart.Data(i, value)); 
        }
        
        lineChart.getData().add(data);
       
        return lineChart;
    }
    
    public static void main(String[] args) {
        launch(SavingsCalculatorApplication.class);
    }

}
