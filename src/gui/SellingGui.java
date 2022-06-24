package gui;

import agents.AcheteurAgent;
import jade.gui.GuiEvent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class SellingGui extends JFrame {
    private JLabel jLabelAcheteur = new JLabel("Nom  de l'acheteur ");
    private JLabel jLabelVendeur = new JLabel("Nom  de vendeur ");
    private JTextField jTextFieldAcheteur = new JTextField(12);
    private JTextField jTextFieldVendeur = new JTextField(12);
    private JButton jButtonAcheteur = new JButton("Enregistrer");
    private JButton jButtonVendeur = new JButton("Enregistrer");
    private AcheteurAgent acheteurAgent;



    public SellingGui(){
        JPanel jPanel1 = new JPanel();
        JPanel jPanel2 = new JPanel();
        jPanel1.setLayout(new FlowLayout());
        jPanel2.setLayout(new FlowLayout());

        jPanel1.add(jLabelAcheteur);
        jPanel1.add(jTextFieldAcheteur);
        jPanel1.add(jButtonAcheteur);

        jPanel2.add(jLabelVendeur);
        jPanel2.add(jTextFieldVendeur);
        jPanel2.add(jButtonVendeur);

        this.setLayout(new BorderLayout());
        this.add(jPanel1,BorderLayout.NORTH);
        this.add(jPanel2,BorderLayout.CENTER);

        this.setSize(600,400);
        this.setVisible(true);

        jButtonAcheteur.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String agentAcheteurName = jTextFieldAcheteur.getText();
                GuiEvent guiEvent = new GuiEvent(this,1);
                Map<String,Object> params = new HashMap<>();
//                params.put("agentAcheteur",agentAcheteurName);
//                guiEvent.addParameter(params);
                guiEvent.addParameter(agentAcheteurName);
                acheteurAgent.onGuiEvent(guiEvent);
            }
        });

        jButtonVendeur.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String agentName = jTextFieldVendeur.getText();
            }
        });

//        BoxLayout boxlayout = new BoxLayout(this, BoxLayout.Y_AXIS);
//        this.setLayout(boxlayout);

    }

    public AcheteurAgent getAcheteurAgent() {
        return acheteurAgent;
    }

    public void setAcheteurAgent(AcheteurAgent acheteurAgent) {
        this.acheteurAgent = acheteurAgent;
    }
}
