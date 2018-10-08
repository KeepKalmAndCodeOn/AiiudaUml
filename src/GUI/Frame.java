package GUI;

import javax.swing.*;

public class Frame extends JFrame {
    public Frame(JPanel contenedor, String titulo, int ancho, int alto){
        add(contenedor);
        setTitle(titulo);
        setSize(ancho,alto);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
