package com.aorihuela.abstraccion.form.elementos.select;

public class Opcion {
    private String valor;
    private String nombre;
    private boolean selected;

    // CONSTRUCTORES

    public Opcion() {
    }

    public Opcion(String valor, String nombre) {
        this.valor = valor;
        this.nombre = nombre;
    }

    //GETERS AND SETERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
