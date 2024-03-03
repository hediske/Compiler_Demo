package com.compiler.gui.Communication;

import com.compiler.gui.controller.HomePanelController;
import com.compiler.gui.controller.MainPanelController;
import com.compiler.gui.controller.SidePanelController;

///MEDIATOR  PATTERN
public class MediatorSpanImpl implements IMediatorSpan{

    public MainPanelController MainController;
    public SidePanelController SideController;
    public HomePanelController HomeController;
    
    @Override
    public void registerControllerMain(MainPanelController _Maincontroller) {
        MainController=_Maincontroller;
    }

    @Override
    public void registerControllerSpan(SidePanelController sidecontroller) {
        this.SideController=sidecontroller;
    }

    @Override
    public void registerControllerHome(HomePanelController homePaneController) {
       this.HomeController=homePaneController;
    }


    //SINGLETON PATTERN 
    private MediatorSpanImpl(){}
    public static MediatorSpanImpl getInstance(){
        return MadiatorSpanImplHolder.INSTANCE;
    }
    private static class MadiatorSpanImplHolder{
        private static MediatorSpanImpl INSTANCE = new MediatorSpanImpl();
    }

    
}
