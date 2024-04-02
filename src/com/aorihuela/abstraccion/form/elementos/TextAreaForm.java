package com.aorihuela.abstraccion.form.elementos;

public class TextAreaForm extends ElementoForm{
    //ATRIBUTOS
    private Integer filas;
    private Integer columnas;


    // CONSTRUCCTORES
    public TextAreaForm(String nombre) {
        super(nombre);
    }

    public TextAreaForm(String nombre, Integer filas, Integer columnas) {
        super(nombre);
        this.filas = filas;
        this.columnas = columnas;
    }

    // GETERS Y SETERS

    // IMPLEMENTACION DE METODOS ABSTRACTOS DEL PADRE
    @Override
    public String dibujarHtml() {
        return "<textarea name=\"" + this.nombre
                + "\" rows=\"" + this.filas
                + "\" cols=\"" + this.columnas
                + "\">\n" + this.valor
                + "\n</textarea>";
//        <textarea id="w3review" name="w3review" rows="4" cols="50">
    }

    @Override
    public boolean esValido() {
        return false;
    }
}


/*
-filas: Integer
-columnas: Integer
+dibujarHtml(): String
* }*/