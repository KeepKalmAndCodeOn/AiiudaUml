package GUI;

import GUI.Elementos.DrawElement;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class WorkFrame extends JPanel {
    private ArrayList<JPanel> elementos;
    public WorkFrame(int ancho, int alto){
        elementos = new ArrayList<>();
        setSize(ancho, alto);
        setBackground(new Color(32,32,32));
        setLayout(null);
    }
    public void addElmement(JPanel e){
        elementos.add(e);
    }
    public ArrayList<JPanel> getElementos() {
        return elementos;
    }
}
