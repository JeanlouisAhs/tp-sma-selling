package containers;

import agents.AcheteurAgent;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;
import jade.wrapper.ControllerException;

public class AcheteurContainer {
    private String name;
    public AcheteurContainer(){
        Runtime runtime = Runtime.instance();
        ProfileImpl profilImp = new ProfileImpl(false);
        profilImp.setParameter(ProfileImpl.MAIN_HOST, "localhost");
        profilImp.setParameter(ProfileImpl.CONTAINER_NAME, "Acheteurs");
        AgentContainer agentContainer = runtime.createAgentContainer(profilImp);
        try {
            AgentController agentController = agentContainer.createNewAgent("Acheteur", AcheteurAgent.class.getName(),new Object[]{"XML"});
//            AgentController agentController1 = agentContainer.createNewAgent("Acheteur1", AcheteurAgent.class.getName(),new Object[]{"XML"});
//            AgentController agentController2 = agentContainer.createNewAgent("Acheteur2", AcheteurAgent.class.getName(),new Object[]{"XML"});

            agentController.start();
//            agentController1.start();
//            agentController2.start();
        } catch (ControllerException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public AcheteurContainer(String name) {
        this.name = name;
        Runtime runtime = Runtime.instance();
        ProfileImpl profilImp = new ProfileImpl(false);
        profilImp.setParameter(ProfileImpl.MAIN_HOST, "localhost");
        profilImp.setParameter(ProfileImpl.CONTAINER_NAME, "Acheteurs");
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
