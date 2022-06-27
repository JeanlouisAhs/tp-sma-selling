package ifri;

import containers.AcheteurContainer;
import containers.ConsommateurContainer;
import containers.MainContainer;
import containers.VendeurContainer;
import gui.SellingGui;

public class SMA {
    public static void main(String[] args) {
        SellingGui gui = new SellingGui();
        MainContainer mainContainer = new MainContainer();
        ConsommateurContainer consommateurContainer = new ConsommateurContainer();
        AcheteurContainer acheteurContainer = new AcheteurContainer();
        VendeurContainer vendeurContainer = new VendeurContainer();
    }
}
