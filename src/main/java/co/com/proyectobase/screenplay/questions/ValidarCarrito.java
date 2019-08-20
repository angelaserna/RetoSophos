package co.com.proyectobase.screenplay.questions;

import co.com.proyectobase.screenplay.ui.WebMetroPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;

public class ValidarCarrito implements Question<Boolean> {

    String resultadoEsperado;

    public ValidarCarrito(String resultadoEsperado) {
        this.resultadoEsperado = resultadoEsperado;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        List<WebElementFacade> listaPosiciones = WebMetroPage.CARRITO.resolveAllFor( actor );
        int i = actor.recall( "posicion" );

        String objeto = listaPosiciones.get( i ).getText();
        return objeto.equals( resultadoEsperado );

    }
}
