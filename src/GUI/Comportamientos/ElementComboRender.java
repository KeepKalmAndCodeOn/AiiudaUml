package GUI.Comportamientos;

import javax.swing.*;
import javax.swing.plaf.basic.BasicComboBoxRenderer;
import java.awt.*;

class ElementComboRender extends BasicComboBoxRenderer
{
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus)
    {
        super.getListCellRendererComponent(list, value, index,isSelected, cellHasFocus);
        if (value != null)
        {
            ElementCombo item = (ElementCombo)value;
            setText( item.getLabel().toUpperCase() );
        }

        if (index == -1)
        {
            ElementCombo item = (ElementCombo)value;
            setText( item.getLabel().toUpperCase());
        }

        return this;
    }
}