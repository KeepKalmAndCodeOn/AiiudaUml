package Diagrammer.Elementos;

public class ElementCombo{
    private int value;
    private String tipo;
    private String label;

    public ElementCombo(int value, String tipo, String label) {
        this.value = value;
        this.tipo = tipo;
        this.label = label;
    }
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }


}
