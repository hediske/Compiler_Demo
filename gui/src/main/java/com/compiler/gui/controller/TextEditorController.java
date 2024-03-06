package com.compiler.gui.controller;


import java.time.Instant;
import java.util.Date;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;


public class TextEditorController {
    @FXML
    private TextArea textdata;

    void initialize(){};

    String setText(String str){
        textdata.setText(str);
        return Date.from(Instant.now()).toString()+"    : File Opened";
    }

    String getText(){
        return textdata.getText();
    }
}
