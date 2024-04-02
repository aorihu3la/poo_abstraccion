package com.aorihuela.abstraccion.form;

import com.aorihuela.abstraccion.form.elementos.*;
import com.aorihuela.abstraccion.form.elementos.select.Opcion;

import java.util.ArrayList;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {
        InputForm username = new InputForm("username", "text");
        InputForm password = new InputForm("clave", "password");
        InputForm correo = new InputForm("correo", "email");
        InputForm edad = new InputForm("edad", "number");

        TextAreaForm experiencia = new TextAreaForm("exp", 4, 9);

        SelectForm lenguajePrg = new SelectForm("lenguajeP");
        Opcion java = new Opcion("1", "Java");
        lenguajePrg.addOpcion(java);
        lenguajePrg.addOpcion(new Opcion("2", "Python"));
        lenguajePrg.addOpcion(new Opcion("3", "C#"));
        lenguajePrg.addOpcion(new Opcion("4", "JavaScript"));
        lenguajePrg.addOpcion(new Opcion("5", "Visual C"));
        lenguajePrg.addOpcion(new Opcion("6", "PHP"));

        username.setValor("aorihuela");
        password.setValor("abcd123");
        correo.setValor("aorihuela@gmail.com");
        edad.setValor("15");
        experiencia.setValor("21 años de trabajo en la Administracion Tributaria de Perú");
        java.setSelected(true);

        List<ElementoForm> elementos = new ArrayList<>();
        elementos.add(username);
        elementos.add(password);
        elementos.add(correo);
        elementos.add(edad);
        elementos.add(experiencia);
        elementos.add(lenguajePrg);

        for(ElementoForm e: elementos){
            System.out.println(e.dibujarHtml());
        }


    }
}