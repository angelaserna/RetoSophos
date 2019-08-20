package co.com.proyectobase.screenplay.questions;

import net.serenitybdd.screenplay.Question;

public class Verificar {

    public static Question<Boolean> carrito(String resultadoEsperado){
        return new ValidarCarrito(resultadoEsperado);
    }

}
