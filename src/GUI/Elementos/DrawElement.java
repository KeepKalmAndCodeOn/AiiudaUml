package GUI.Elementos;


import GUI.Comportamientos.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Random;

public class DrawElement extends JPanel implements Drawable{
    private Random id;
    private String tipo;
    private String titulo;
    public DrawElement(String tipo){
        id = new Random();
        this.tipo = tipo;
        this.setTitulo(tipo+" - "+id.nextInt(100));
    }

    @Override
    public JPanel Draw(String tipo, ConfigMenu config) {
        this.setTipo(tipo);
        this.setTitulo(tipo+" - "+id.nextInt(100));
        JTextField texto = new JTextField(getTitulo());
        texto.setOpaque(false);
        texto.setBorder(BorderFactory.createLineBorder(new Color(150,151,155)));
        texto.setHorizontalAlignment(JTextField.CENTER);

        setLayout(new BorderLayout(5,5));
        add(texto, BorderLayout.NORTH);
        setLocation(15,15);
        setBounds(15,15,150,80);
        setBorder(BorderFactory.createLineBorder(new Color(150,151,155)));

        PopUpMenu menu = new PopUpMenu();
        if(config.getMenu().size() > 0){
            for(ActionItemPopupMenu opcion: config.getMenu()){
                menu.addActionElment(opcion);
            }
        }else{
            ActionItemPopupMenu sinMenu = new ActionItemPopupMenu();
            menu.addActionElment(sinMenu);
        }

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if(e.isPopupTrigger()) menu.show(e.getComponent(), e.getX(), e.getY());
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                if(e.isPopupTrigger()) menu.show(e.getComponent(), e.getX(), e.getY());
            }
        });

        return this;
    }
    @Override
    protected void paintComponent(Graphics g) {
        final Graphics2D g2 = (Graphics2D) g.create();
        g2.setPaint(new GradientPaint(
                new Point(0, 0),
                new Color(207,208,212),
                new Point(0, getHeight()),
                new Color(153,153,153)));
        g2.fillRect(0, 0, getWidth(), getHeight());
        g2.dispose();
        super.paintComponent(g);
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
