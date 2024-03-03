package com.compiler.gui.controller;


import com.gluonhq.richtextarea.RichTextArea;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;


public class MainPanelController{

    
    @FXML
    private HBox imageContainer;
    @FXML
    private HBox container;
    @FXML
    private AnchorPane textArea;
    private RichTextArea editor = new RichTextArea();
    public void initialize(){

        AnchorPane.setTopAnchor(editor, 0.0);
        AnchorPane.setBottomAnchor(editor, 0.0);
        AnchorPane.setLeftAnchor(editor, 0.0);
        AnchorPane.setRightAnchor(editor, 0.0);
        editor.autosize();
        textArea.getChildren().add(editor);
    }

    public void onFileLoad(String FilePath) {
       System.out.println(FilePath);
       imageContainer.setVisible(false);
       container.setVisible(true);
    }
}
