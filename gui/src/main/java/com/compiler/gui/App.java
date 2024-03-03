package com.compiler.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;


public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
     
        BorderPane root = FXMLLoader.load(getClass().getResource("view/OrderedPanel.fxml"));
        root.setBackground(null);
        Scene scene=new Scene(root,400,600,Color.valueOf("2F2E30"));
        scene.getStylesheets().add(getClass().getResource("style/application.css").toExternalForm());//globalStyling    
        try{
            Image image = new Image("icon.png")   ;


            stage.getIcons().add(image);
            stage.setScene(scene);
            stage.setMaximized(true);
            stage.setMinHeight(720);
            stage.setMinWidth(420);
            stage.setTitle("Compiler Project ");
            stage.show();
    }
    catch(IllegalArgumentException e){
            System.out.println("error loading the image");
    }
    }

    public static void main(String[] args) {
        launch();
    }
}