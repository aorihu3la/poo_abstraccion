package com.aorihuela.abstraccion.form.elementos;

abstract public class ElementoForm {

    //PROPIEDADES
    protected String nombre;
    protected String valor;

    // CONSTRUCTORES

    public ElementoForm() {
    }

    public ElementoForm(String nombre) {
        this();
        this.nombre = nombre;
    }

    // GETERS & SETERS


    public void setValor(String valor) {
        this.valor = valor;
    }


    // METODOS
    abstract public String dibujarHtml();
    abstract public boolean esValido();
//    abstract public void addValidador(validador Validador);

}

/*
abstract class ElementoForm{
#nombre: String
#valor: String
#validadores: List
#errores: List
+{abstract}dibujarHtml(): String
+esValido(): Boolean
+addValidador(validador: Validador)
}
* */