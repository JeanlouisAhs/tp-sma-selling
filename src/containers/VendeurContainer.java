package containers;

import agents.AcheteurAgent;
import agents.VendeurAgent;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;
import jade.wrapper.ControllerException;

public class VendeurContainer {
    private String name;
    public VendeurContainer(){
        Runtime runtime = Runtime.instance();
        ProfileImpl profilImp = new ProfileImpl(false);
        profilImp.setParameter(ProfileImpl.MAIN_HOST, "localhost");
        profilImp.setParameter(ProfileImpl.CONTAINER_NAME, "Vendeurs");
        AgentContainer agentContainer = runtime.createAgentContainer(profilImp);
        try {
            AgentController agentController = agentContainer.createNewAgent("Acheteur", VendeurAgent.class.getName(),new Object[]{"XML"});

            agentController.start();
        } catch (ControllerException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public VendeurContainer(String name) {
        this.name = name;
        Runtime runtime = Runtime.instance();
        ProfileImpl profilImp = new ProfileImpl(false);
        profilImp.setParameter(ProfileImpl.MAIN_HOST, "localhost");
        profilImp.setParameter(ProfileImpl.CONTAINER_NAME, "Vendeurs");
        AgentContainer agentContainer = runtime.createAgentContainer(profilImp);
        try {
            AgentController agentController = agentContainer.createNewAgent(""+name, AcheteurAgent.class.getName(),new Object[]{"XML"});
//
            agentController.start();

        } catch (ControllerException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
