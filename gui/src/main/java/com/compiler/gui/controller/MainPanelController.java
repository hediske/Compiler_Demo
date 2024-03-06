package com.compiler.gui.controller;


import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;

import com.compiler.gui.service.FileService;
import com.gluonhq.richtextarea.RichTextArea;
import com.gluonhq.richtextarea.model.Document;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;


public class MainPanelController{

    
    @FXML
    private HBox imageContainer;
    @FXML
    private HBox container;
    @FXML
    private AnchorPane textArea;
    @FXML
    private LoggerController loggerController;
    @FXML
    private TextEditorController textController; 
    private String FilePath;
    public void initialize(){
    }

    public void DisplayEditor(){
        imageContainer.setVisible(false);
        container.setVisible(true);
    }
    public void onFileLoad(String FilePath) {
        this.FilePath=FilePath;
        String result="";
        try{
        result = Files.readString(Path.of(FilePath));
        }
        catch(Exception e){
            e.printStackTrace();
        }
        //code here TODO: controller for textEditor using result
        String log = textController.setText(result);
        DisplayEditor();

    }
    public void SaveFile(){
        Alert alert = new Alert(AlertType.CONFIRMATION);
        try{
            FileWriter Originalfile = new FileWriter(FilePath,false);           
            Originalfile.write(textController.getText());
            Originalfile.close();
            alert.setContentText("File "+FileService.NameExtractor(FilePath) +" saved successfully");
            
        }
        catch(Exception e){
            System.out.println("error saving the file");
            alert.setAlertType(AlertType.ERROR);
            alert.setContentText("File "+FileService.NameExtractor(FilePath) +" not saved ");
        }
        finally{
            alert.show();
        }
}
}
