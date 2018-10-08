package Diagrammer.Elementos;

import Diagrammer.Acciones.ActionItemPopupMenu;

import java.util.ArrayList;

public class ConfigMenu {
    private DrawElement me;
    private ArrayList<ActionItemPopupMenu> menu;
    public ArrayList<ActionItemPopupMenu> getMenu() {
        return menu;
    }
    public ConfigMenu(DrawElement me)
    {
        this.me = me;
        menu = new ArrayList<>();
    }
    public void addOptionMenu(ActionItemPopupMenu option){
        option.setMe(this.me);
        menu.add(option);
    }
}
