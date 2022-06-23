package ifri;

import containers.AcheteurContainer;
import containers.ConsommateurContainer;
import containers.MainContainer;
import containers.VendeurContainer;

public class SMA {
    public static void main(String[] args) {
        MainContainer mainContainer = new MainContainer();
        ConsommateurContainer consommateurContainer = new ConsommateurContainer();
        AcheteurContainer acheteurContainer = new AcheteurContainer();
        VendeurContainer vendeurContainer = new VendeurContainer();
    }
}
