package co.com.proyectobase.screenplay.interactions;

import co.com.proyectobase.screenplay.ui.WebMetroPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import org.openqa.selenium.Keys;

public class Buscar implements Interaction {

    private String producto;

    public Buscar(String producto){
        this.producto = producto;
    }

    public static Buscar existencia(String producto) {
        return Tasks.instrumented( Buscar.class, producto );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo( Check.whether( WebMetroPage.POPUP.resolveFor( actor ).isVisible() ).andIfSo( Click.on( WebMetroPage.BTN_CANCELAR ) ) );
        actor.attemptsTo( Enter.theValue(producto).into( WebMetroPage.CMB_BUSQUEDA ));
        WebMetroPage.CMB_BUSQUEDA.resolveFor( actor ).sendKeys( Keys.ENTER );
        actor.attemptsTo( WaitWhile.waitClass(2000) );

    }
}
