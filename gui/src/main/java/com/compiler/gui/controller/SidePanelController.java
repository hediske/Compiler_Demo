package com.compiler.gui.controller;

import java.io.File;

import com.compiler.service.FileService;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.SVGPath;
import javafx.stage.Stage;

public class SidePanelController {
    @FXML
    Button newFile;
    @FXML
    Button open;
    @FXML
    Button save;
    @FXML
    Button compile;
    
    private FileService fileservice = new FileService();

    public void prepareButtons(){
        Region iconNew = new Region();
        iconNew.getStyleClass().add("icon-New");
        newFile.setGraphic(iconNew);
        newFile.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
    
        Region iconOpen = new Region();
        iconOpen.getStyleClass().add("icon-Open");
        open.setGraphic(iconOpen);
        open.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
    
        Region iconSave = new Region();
        iconSave.getStyleClass().add("icon-Save");
        save.setGraphic(iconSave);
        save.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
    
        Group iconCompile = new Group();
        SVGPath path = new SVGPath();
        path.setContent("M28.6,13c-1.6,0.2-3.1-0.5-4-2c-0.8-1.4-0.7-3.2,0.3-4.4c-1.5-1.4-3.3-2.4-5.2-3C19.1,5,17.7,6,16,6 s-3.1-1-3.7-2.5c-2,0.6-3.8,1.6-5.2,3C8,7.8,8.2,9.6,7.3,11c-0.8,1.4-2.4,2.2-4,2c-0.2,1-0.4,2-0.4,3c0,1,0.1,2.1,0.4,3 c1.6-0.2,3.1,0.5,4,2c0.8,1.4,0.7,3.2-0.3,4.4c1.5,1.4,3.3,2.4,5.2,3c0.6-1.4,2-2.5,3.7-2.5s3.1,1,3.7,2.5c2-0.6,3.8-1.6,5.2-3 c-0.9-1.2-1.1-3-0.3-4.4c0.8-1.4,2.4-2.2,4-2c0.2-1,0.4-2,0.4-3C29,15,28.9,13.9,28.6,13z");
        path.setStroke(Color.valueOf("#a19a9a"));
        path.setStrokeWidth(1);
        path.setFill(Color.TRANSPARENT);
    
        
        Line line = new Line(18, 12, 14, 20);
        line.setStroke(Color.valueOf("#a19a9a")); // Set stroke color
        line.setStrokeWidth(1); 
    
        SVGPath polyline1 = new SVGPath();
        polyline1.setContent("M11,13 8,16 11,19 ");
        polyline1.setFill(Color.valueOf("#a19a9a"));
    
        SVGPath polyline2 = new SVGPath();
        polyline2.setContent("M21,13 24,16 21,19 ");
        polyline2.setFill(Color.valueOf("#a19a9a"));
    
    
        iconCompile.getChildren().addAll( path ,polyline1, polyline2,line);
        compile.setGraphic(iconCompile);
        compile.setOnMouseEntered(event -> {
            path.setStroke(Color.WHITESMOKE);
            line.setStroke(Color.WHITESMOKE);
            polyline1.setFill(Color.WHITESMOKE);
            polyline2.setFill(Color.WHITESMOKE);
        });

        compile.setOnMouseExited(event -> {
            path.setStroke(Color.valueOf("#a19a9a"));
            line.setStroke(Color.valueOf("#a19a9a"));
            polyline1.setFill(Color.valueOf("#a19a9a"));
            polyline2.setFill(Color.valueOf("#a19a9a"));
        });
    }
    
    @FXML
    public void loadFile(ActionEvent e){
        Button node= (Button) e.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        fileservice.loadFile("Please provide the file to compile   ! ", stage);
        
    }

    @FXML
    public void saveFile(ActionEvent e){

    }
    @FXML
    public void openFile(ActionEvent e){
    }
    @FXML
    public void compileFile(ActionEvent e){
    }

    public void initialize() {
        prepareButtons();
    }   

}
