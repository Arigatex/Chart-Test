package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    LineChart chart1;

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Through FXML
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Chart Test");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

        //Manually
//        VBox vbox=new VBox(chart1);
//        Scene scene=new Scene(vbox,600,400);
//        primaryStage.setScene(scene);
//        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
