package Diagrammer.Interfaces;

import Diagrammer.Elementos.ConfigMenu;

import javax.swing.*;

public interface Drawable {
    JPanel Draw(String tipo, ConfigMenu config);
}
