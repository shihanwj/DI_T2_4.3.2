package es.ieslosmontecillos.fxmltableview;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FXMLTableView extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(FXMLTableView.class.getResource("fxml_tableview.fxml"));

        Scene scene = new Scene(fxmlLoader.load());
        primaryStage.setTitle("FXML TableView Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}