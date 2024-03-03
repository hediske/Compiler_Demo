package com.compiler.gui.Communication;

import com.compiler.gui.controller.HomePanelController;
import com.compiler.gui.controller.MainPanelController;
import com.compiler.gui.controller.SidePanelController;

public interface IMediatorSpan {
    void registerControllerMain(MainPanelController maincontroller);
    void registerControllerSpan(SidePanelController spancontroller);
    void registerControllerHome(HomePanelController homePaneController);
}