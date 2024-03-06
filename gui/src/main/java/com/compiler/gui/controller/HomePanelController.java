package com.compiler.gui.controller;


import com.compiler.gui.service.FileService;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;
import javafx.scene.control.Alert.AlertType;

public class HomePanelController {

    private FileService  fileservice = new FileService();

    @FXML
    public void ShowAboutMe(ActionEvent e){

        Alert alert = new Alert(AlertType.NONE);
        alert.setTitle("About Me");
        alert.setHeaderText("Hello out There");
        alert.setContentText("This Project was made by 💖  . Brought to you by Hediske  ENjoy ! \n \n    Mohamed Hedi Aissi - Software engineer student in FST\n\n      2023-2024" );
        
        alert.setResizable(false);

        alert.getButtonTypes().add(ButtonType.CLOSE);
        alert.show();
        alert.setGraphic(null);
    }

    @FXML
    public void help(ActionEvent e){

        Alert alert = new Alert(AlertType.NONE);
        alert.setTitle("Help");
        alert.setContentText("This project is a Compiler based on Java that offers to the user the possiblity of :  \n\n  1- Generating the First and Follows of the grammar \n  2- Generating the SLR table and verifying if the grammar is SLR \n  3- Verifying the type correctly \n  4- Compiling  !!   " );
        alert.setResizable(false);
        alert.getButtonTypes().add(ButtonType.CLOSE);
        alert.setHeight(400);
        alert.setGraphic(null);
        alert.show();
        alert.getDialogPane().lookupButton(ButtonType.CLOSE).setVisible(false);

    }


    @FXML
    public void loadFile(ActionEvent e){

        MenuItem node= (MenuItem) e.getSource();
        Stage stage = (Stage) node.getParentPopup().getOwnerWindow();
        fileservice.loadFile("Please provide the file to compile   ! ", stage);
    }

    @FXML
    public void saveFile(ActionEvent e){
        MenuItem node= (MenuItem) e.getSource();
        Stage stage = (Stage) node.getParentPopup().getOwnerWindow();
        fileservice.saveFile(stage);
    }
}
