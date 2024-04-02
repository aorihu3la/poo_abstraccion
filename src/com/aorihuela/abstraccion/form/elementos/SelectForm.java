package com.aorihuela.abstraccion.form.elementos;

import com.aorihuela.abstraccion.form.elementos.select.Opcion;

import java.util.ArrayList;
import java.util.List;

public class SelectForm extends ElementoForm{

    private List<Opcion> opciones;

    // CONSTRUCTORES

    public SelectForm(String nombre) {
        super(nombre);
        this.opciones = new ArrayList<Opcion>();
    }

    public SelectForm(String nombre, List<Opcion> opciones) {
        super(nombre);
        this.opciones = opciones;
    }

    // GETERS Y SETERS


    // METODOS

    // de forma encadenada
    public SelectForm addOpcion(Opcion opcion){
        this.opciones.add(opcion);
        return this;
    }
    @Override
    public String dibujarHtml() {
        StringBuilder sb = new StringBuilder("<select ");
            sb.append("name= '")
              .append(this.nombre)
              .append("'>");

            for(Opcion opcion: this.opciones){
                sb.append("\n <option value='")
                        .append(opcion.getNombre())
                        .append("'");
                if(opcion.isSelected()){
                    sb.append(" selected");
                    //this.setValor();
                }
                sb.append(">")
                        .append(opcion.getValor())
                        .append("</option>");
            }
            sb.append("\n</select>");
        return sb.toString();
    }

    @Override
    public boolean esValido() {
        return false;
    }
}

/*
<label for="cars">Choose a car:</label>

<select name="cars" id="cars">
  <option value="volvo">Volvo</option>
  <option value="saab">Saab</option>
  <option value="mercedes">Mercedes</option>
  <option value="audi">Audi</option>
</select>
* */