package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    LineChart chart1;
    XYChart.Series series1 = new XYChart.Series();
    NumberAxis xAxis = new NumberAxis();
    NumberAxis yAxis = new NumberAxis();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        xAxis.setLabel("X Axis");
        yAxis.setLabel("Y Axis");
        series1.setName("Series 1");
        chart1 = new LineChart(xAxis, yAxis);
        series1.getData().add(new XYChart.Data<>(1, 20));
        series1.getData().add(new XYChart.Data<>(2, 100));
        series1.getData().add(new XYChart.Data<>(3, 80));
        series1.getData().add(new XYChart.Data<>(4, 180));
        series1.getData().add(new XYChart.Data<>(5, 20));
        series1.getData().add(new XYChart.Data<>(6, -10));
        chart1.getData().add(series1);

    }
}
