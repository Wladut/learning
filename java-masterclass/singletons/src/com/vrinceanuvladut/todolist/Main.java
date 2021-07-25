package com.vrinceanuvladut.todolist;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("mainwindow.fxml"));
        primaryStage.setTitle("Todo List");
        primaryStage.setScene(new Scene(root, 900, 400));
        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {
        TodoData.getInstance().storeTodoItems();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
