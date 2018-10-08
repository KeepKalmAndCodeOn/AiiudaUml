package GUI;

import javax.swing.*;
import java.awt.*;

public class ToolBox extends JPanel {
    public ToolBox(int ancho, int alto){
        setPreferredSize(new Dimension(ancho,alto));
        setBackground(new Color(252,114,16));
        setLayout(new FlowLayout());
    }

}
