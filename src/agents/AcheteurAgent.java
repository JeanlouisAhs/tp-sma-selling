package agents;

import containers.AcheteurContainer;
import gui.SellingGui;
import jade.core.Agent;
import jade.gui.GuiAgent;
import jade.gui.GuiEvent;
import jade.wrapper.AgentController;

public class AcheteurAgent extends GuiAgent {

//    private SellingGui gui;

    @Override
    protected void setup() {
//        gui = new SellingGui();
//        gui.setAcheteurAgent(this);
        System.out.println("Démarrage de l'Agent acheteur ");
    }

    @Override
    public void onGuiEvent(GuiEvent guiEvent) {
//        switch (guiEvent.getType()){
//            case 1:
//
//                break;
//            default:
//                break;
//        }
    }
}
