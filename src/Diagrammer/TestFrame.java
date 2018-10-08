package Diagrammer;

import java.awt.*;

import Diagrammer.Acciones.ActionItemPopupMenu;
import Diagrammer.Container.Frame;
import Diagrammer.Container.MainContainer;
import Diagrammer.Container.ToolBox;
import Diagrammer.Container.WorkFrame;
import Diagrammer.Elementos.*;

public class TestFrame{

    Diagrammer.Container.Frame frame;
    ToolBox box;
    WorkFrame drawZone;
    MainContainer main;
    Dimension buttonsDimension;
    DrawInterfaceElement dibujo;

    public TestFrame(){
        // HELPER
        buttonsDimension = new Dimension(150,50);
        // CAJA DE HERRAMIENTAS
        box = new ToolBox(150,450);
        // ZONA DE DIBUJO
        drawZone = new WorkFrame(750,550);

        // DIBUJOS
        DrawElement graficoInterfase = new DrawInterfaceElement("interface");
        DrawElement graficoClase = new DrawClassElement("clase");
        DrawElement graficoUsuario = new DrawPersonaElement("persona");

        //ACCIONES DE MENU CONTEXTUAL
        ActionItemPopupMenu agregar = new ActionItemPopupMenu("Agregacion", "punteada", drawZone);
        agregar.addPosible(graficoClase);
        agregar.addPosible(graficoUsuario);
        agregar.addPosible(graficoInterfase);

        //ACCIONES DE MENU CONTEXTUAL
        ActionItemPopupMenu componer = new ActionItemPopupMenu("Composiciòn", "linea-con rombo relleno", drawZone);
        componer.addPosible(graficoClase);

        //ACCIONES DE MENU CONTEXTUAL
        ActionItemPopupMenu realizar = new ActionItemPopupMenu("Realizacion", "linea continua", drawZone);
        componer.addPosible(graficoInterfase);

        //ACCIONES DE MENU CONTEXTUAL
        ActionItemPopupMenu actuar = new ActionItemPopupMenu("Interactua", "flecha continua", drawZone);
        actuar.addPosible(graficoInterfase);
        actuar.addPosible(graficoUsuario);
        actuar.addPosible(graficoClase);

        //CONFIG MENU INTERFACES
        ConfigMenu interfacesMenu = new ConfigMenu(graficoInterfase);
        interfacesMenu.addOptionMenu(realizar);

        // COFIG MENU CLASES
        ConfigMenu clasesMenu = new ConfigMenu(graficoClase);
        clasesMenu.addOptionMenu(agregar);
        clasesMenu.addOptionMenu(componer);

        // CONFIG MENU USUARIO
        ConfigMenu userMenu = new ConfigMenu(graficoUsuario);
        userMenu.addOptionMenu(actuar);

        // BOTONERA
        ToolButton btnInterfaces = new ToolButton(drawZone, graficoInterfase, interfacesMenu, buttonsDimension);
        ToolButton btnClases = new ToolButton(drawZone, graficoClase, clasesMenu, buttonsDimension);
        ToolButton btnUsuarios = new ToolButton(drawZone, graficoUsuario, userMenu, buttonsDimension);
        box.add(btnInterfaces);
        box.add(btnClases);
        box.add(btnUsuarios);

        // CONFIG LAYOUT
        main = new MainContainer(box, drawZone, 1000,600);
        frame = new Frame(main, "KCACOn",700,601);
        frame.repaint();
    }
    public static void main(String [] args){
        new TestFrame();
    }
}
