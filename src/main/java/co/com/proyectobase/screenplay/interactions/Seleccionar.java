package co.com.proyectobase.screenplay.interactions;

import co.com.proyectobase.screenplay.ui.WebMetroPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;

public class Seleccionar implements Interaction {

    private String referencia;

    public Seleccionar(String referencia){
        this.referencia = referencia;
    }

    public static Seleccionar producto(String referencia) {
        return Tasks.instrumented( Seleccionar.class, referencia );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> listaProductos = WebMetroPage.LST_PRODUCTOS.resolveAllFor( actor );
        List<WebElementFacade> listaBotonAgregar = WebMetroPage.BTN_AGREGAR.resolveAllFor( actor );

        for (int i=0; i<listaProductos.size(); i++){
            int j = i;
            String nombre = listaProductos.get( i ).getText();

            if (nombre.equals( referencia )){
                listaBotonAgregar.get( j ).click();
                actor.remember( "posicion", j );
            }
        }
    }
}
