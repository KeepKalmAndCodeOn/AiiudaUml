package Diagrammer.Elementos;

import Diagrammer.Acciones.ActionPopupMenuListener;
import Diagrammer.Acciones.ActionItemPopupMenu;

import javax.swing.*;

public class PopUpMenu extends JPopupMenu {
    private ActionItemPopupMenu actionItems;

    public void addActionElment(ActionItemPopupMenu action){
        JMenuItem menuItem = new JMenuItem(action.getLabel());
        menuItem.addActionListener(action);
        addPopupMenuListener(new ActionPopupMenuListener());
        add(menuItem);
    }
}