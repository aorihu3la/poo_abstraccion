import com.aorihuela.abstraccion.form.elementos.*;

public class Main {
    public static void main(String[] args) {
        ElementoForm elementoForm = new InputForm("txtName", "text");
        System.out.println(elementoForm.dibujarHtml());
        // Nombre: <input type="text" name="name_control" autofocus required />

        ElementoForm elementoTextArea = new TextAreaForm("txtArea", 4, 50);
        System.out.println(elementoTextArea.dibujarHtml());
        //<textarea id="w3review" name="w3review" rows="4" cols="50">

    }
}