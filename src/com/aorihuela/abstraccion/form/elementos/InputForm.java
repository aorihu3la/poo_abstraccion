package com.aorihuela.abstraccion.form.elementos;

public class InputForm extends ElementoForm {
    // PROPIEDADES
    private String tipo ="text";

    // CONSTUCTORES

    public InputForm(String nombre) {
        super(nombre);
    }

    public InputForm(String nombre, String tipo) {
        super(nombre);
        this.tipo = tipo;
    }

    // GETERS Y SETERS
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    // IMPLEMENTACION DE LOS METODOS ABSTRACTOS DE LA CLASE PADRE
    @Override
    public String dibujarHtml() {
        return "<input type = \"" + this.tipo
                + "\" name = \"" + this.nombre
                + "\" value= \"" + this.valor
                + "\" />";
        // Nombre: <input type="text" name="name_control" autofocus required />
    }

    @Override
    public boolean esValido() {
        return false;
    }
}

/*
class InputForm{
-tipo: String="Texto"
+dibujarHtml(): String
}
* */
