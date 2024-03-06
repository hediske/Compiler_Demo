package com.compiler.gui.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

import com.compiler.gui.Communication.MediatorSpanImpl;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class FileService {
    public void loadFile(String str,Stage stage){ //load in a temp file
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle(str);
        fileChooser.getExtensionFilters().add(new ExtensionFilter("Text Files .txt", "*.txt"));
        File selectedFile = fileChooser.showOpenDialog(stage);
        FileStorage(selectedFile);
    }

    public static void FileStorage(File file){
        
        try{
            if(file==null){
                return;
            }
            System.out.println(file.getAbsolutePath());
            MediatorSpanImpl.getInstance().MainController.onFileLoad(file.getAbsolutePath());
        }
        catch(Exception e){
            Alert alert = new Alert(AlertType.ERROR, "Error opening the File ", ButtonType.CLOSE);
            alert.show();
            e.printStackTrace();
        }
    }

    public void saveFile(Stage stage){
        MediatorSpanImpl.getInstance().MainController.SaveFile();
    }

    public static String NameExtractor(String Path){
        File file = new File(Path);
        String fileName = file.getName();
        return fileName;
    }


}
