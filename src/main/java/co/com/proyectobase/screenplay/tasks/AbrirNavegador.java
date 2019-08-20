package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.ui.WebMetroPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirNavegador implements Task {

    WebMetroPage webMetroPage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo( Open.browserOn(webMetroPage) );
    }

    public static AbrirNavegador sitioWebMetro() {
        return Tasks.instrumented( AbrirNavegador.class );
    }
}
