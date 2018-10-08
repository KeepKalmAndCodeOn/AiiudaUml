package GUI.Comportamientos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MotionListener implements MouseMotionListener {
    private JPanel movingPanel;
    private Point pt;
    public MotionListener (JPanel movingPanel) {
        this.movingPanel = movingPanel;
    }
    @Override
    public void mouseDragged(MouseEvent e) {
        pt = SwingUtilities.convertPoint(movingPanel, e.getX(), e.getY(), movingPanel.getParent());
        movingPanel.setBounds(pt.x, pt.y, movingPanel.getWidth(), movingPanel.getHeight());
        movingPanel.repaint();
    }
    @Override
    public void mouseMoved(MouseEvent e) {}
}
