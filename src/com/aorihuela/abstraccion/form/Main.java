package com.aorihuela.abstraccion.form;

import com.aorihuela.abstraccion.form.elementos.*;
import com.aorihuela.abstraccion.form.elementos.select.Opcion;



import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ElementoForm elementoForm = new InputForm("txtName", "text");
        System.out.println(elementoForm.dibujarHtml());
        // Nombre: <input type="text" name="name_control" autofocus required />

        ElementoForm elementoTextArea = new TextAreaForm("txtArea", 4, 50);
        System.out.println("\n" + elementoTextArea.dibujarHtml());
        //<textarea id="w3review" name="w3review" rows="4" cols="50">

        Opcion opcion1 = new Opcion("volvo", "Volvo");
        Opcion opcion2 = new Opcion("Toyota", "toyota");
        Opcion opcion3 = new Opcion("vmw", "BMW");
        opcion3.setSelected(true);

        ArrayList<Opcion> listaOpciones = new ArrayList<Opcion>();
        listaOpciones.add(opcion1);
        listaOpciones.add(opcion2);
        listaOpciones.add(opcion3);

        ElementoForm elementoSelect = new SelectForm("selOpciones", listaOpciones );
        System.out.println("\n" + elementoSelect.dibujarHtml());

    }
}