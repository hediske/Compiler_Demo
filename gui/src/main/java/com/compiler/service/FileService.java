package com.compiler.service;

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
            File tempFile;
            try{
                tempFile = File.createTempFile("temp", ".txt");
            }
            catch(IOException e){
                System.out.println("temporary file error");
                return;
            }
            BufferedReader FileContent = new BufferedReader(new FileReader(file));
            BufferedWriter TempFileContent = new BufferedWriter(new FileWriter(tempFile));
            String line;
            while((line = FileContent.readLine())!=null){
                TempFileContent.write(line);
                TempFileContent.flush();
                TempFileContent.newLine();
            }
            FileContent.close();
            TempFileContent.close();
            MediatorSpanImpl.getInstance().MainController.onFileLoad(tempFile.getAbsolutePath());
        }
        catch(Exception e){
            Alert alert = new Alert(AlertType.ERROR, "Error opening the File ", ButtonType.CLOSE);
            alert.show();
        }
    }


}
