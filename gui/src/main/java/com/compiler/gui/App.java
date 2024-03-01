package com.compiler.gui;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;


public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Group group = new Group();
        Scene scene=new Scene(group,Color.valueOf("2F2E30"));
        System.out.println(File.separator);
        try{
            Image image = new Image("icon.png")   ;
            stage.getIcons().add(image);
        }
        catch(IllegalArgumentException e){
            System.out.println("error loading the image");
        }
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.setMinHeight(720);
        stage.setMinWidth(420);
        stage.setTitle("Compiler Project ");
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}