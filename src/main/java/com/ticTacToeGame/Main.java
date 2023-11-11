package com.ticTacToeGame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.*;

public class Main extends Application {

    private static final String MAIN_VIEW_FXML = "mainView.fxml";
    private static final String MAIN_CSS = "styles/main.css";
    private static final String TITLE = "Tic Tac Toe Game";

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(MAIN_VIEW_FXML));
        Scene scene = new Scene(fxmlLoader.load(), 640, 480);
        stage.setTitle(TITLE);
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource(MAIN_CSS)).toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}