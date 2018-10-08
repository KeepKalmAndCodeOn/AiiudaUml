package GUI.Comportamientos;

import GUI.Elementos.DrawElement;

public interface Validator {
    boolean validate(DrawElement origen, DrawElement destino, String accion);
}
