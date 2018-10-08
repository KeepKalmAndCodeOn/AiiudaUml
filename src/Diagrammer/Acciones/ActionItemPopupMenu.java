package Diagrammer.Acciones;

import Diagrammer.Elementos.DrawElement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

public class ActionItemPopupMenu implements ActionListener
{
    private static final javax.swing.JOptionPane JOptionPane = new JOptionPane();
    private String label;
    private String tipoLinea;
    private ArrayList<String> posible;
    private DrawElement me;
    private JPanel drawZone;

    public ActionItemPopupMenu(){
        this.setLabel("NADA");
        this.setTipoLinea("NINGUNA");
        this.posible = new ArrayList<>();
        this.drawZone = null;
    }
    public ActionItemPopupMenu(String label, String tipoLinea, JPanel drawZone) {
        this.setLabel(label);
        this.setTipoLinea(tipoLinea);
        this.posible = new ArrayList<>();
        this.drawZone = drawZone;
    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try{
            if(drawZone != null){
                String seleccionado= "";
                Vector list = new Vector();
                Component[] components = drawZone.getComponents();
                int cont = 0;
                for (Component component : components) {
                    ElementCombo elemento;
                    if (component instanceof DrawElement) {
                        elemento = new ElementCombo(cont, ((DrawElement) component).getTipo(),((DrawElement) component).getTitulo());
                        list.add(elemento);
                        ++cont;
                    }
                }
                JComboBox optionList = new JComboBox(list);
                optionList.setRenderer( new ElementComboRender() );
                JOptionPane.showMessageDialog(null, optionList, label, JOptionPane.QUESTION_MESSAGE);
                if(optionList.getSelectedItem() != null)
                {
                    seleccionado = ((ElementCombo)optionList.getSelectedItem()).getTipo();
                    esPosible(getMe().getTipo(), seleccionado);
                }else{
                    JOptionPane.showMessageDialog(null, "Seleccion inválida", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, " EXCEPTION "+e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void addPosible(DrawElement opcion){
        getPosible().add(opcion.getTipo().toUpperCase());
    }
    public ArrayList getPosible() {
        return posible;
    }
    public void setPosible(ArrayList posible) {
        this.posible = posible;
    }
    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }
    private void esPosible(String origen, String seleccionado){
        System.out.println(origen + " - " + seleccionado);
        if(getPosible().contains(seleccionado.toUpperCase())){
            JOptionPane.showMessageDialog(null,
                        "Operación realizada correctamente \n DIBUJAR: "+ getTipoLinea(),
                        "Satisfactorio",
                         JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "No es posible realizar esta acción ", "ERROR", JOptionPane.ERROR_MESSAGE);

        }
    }
    public DrawElement getMe() {
        return me;
    }
    public void setMe(DrawElement me) {
        this.me = me;
    }
    public String getTipoLinea() {
        return tipoLinea;
    }
    public void setTipoLinea(String tipoLinea) {
        this.tipoLinea = tipoLinea;
    }
}