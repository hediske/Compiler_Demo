package com.compiler.gui;

import com.compiler.gui.Communication.MediatorSpanImpl;
import com.compiler.gui.controller.HomePanelController;
import com.compiler.gui.controller.MainPanelController;
import com.compiler.gui.controller.SidePanelController;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class AppController {
    @FXML
    private HomePanelController homeController ;
    @FXML
    private SidePanelController sideController;
    @FXML
    private MainPanelController mainController;

    public void initialize(){
        MediatorSpanImpl.getInstance().registerControllerHome(homeController);
        MediatorSpanImpl.getInstance().registerControllerSpan(sideController);
        MediatorSpanImpl.getInstance().registerControllerMain(mainController);
    }
}