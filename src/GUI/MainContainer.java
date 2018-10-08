package GUI;

import javax.swing.*;
import java.awt.*;

public class MainContainer extends JPanel {
    BorderLayout layout = new BorderLayout(0,0);
    public MainContainer(ToolBox box, WorkFrame frame, int ancho, int alto){
        setLayout(layout);
        setSize(ancho,alto);
        setBackground(new Color(78,83,109));
        add(box, layout.WEST);
        add(frame, layout.CENTER);
    }

}
