package Diagrammer.Acciones;

import Diagrammer.Elementos.ConfigMenu;
import Diagrammer.Elementos.DrawElement;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ActionButtonsListener implements ActionListener {
    private JPanel actionZone;
    private ConfigMenu acciones;
    private DrawElement elemento;
    private String tipo;

    public ActionButtonsListener(JPanel actionZone, String tipo, ConfigMenu acciones){
        this.actionZone = actionZone;
        this.tipo = tipo;
        this.acciones = acciones;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        elemento = new DrawElement(tipo);
        JPanel panel = elemento.Draw(tipo, this.acciones);
        panel.addMouseMotionListener(new MotionListener(panel));
        this.actionZone.add(panel);
        this.actionZone.revalidate();
        this.actionZone.repaint();
    }
}
