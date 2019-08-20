package co.com.proyectobase.screenplay.interactions;

import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class WaitWhile implements Interaction {

    private int var;

    protected WaitWhile(int var){
        this.var = var;
    }

    public static WaitWhile waitClass(int var) {
        return Tasks.instrumented( WaitWhile.class, var );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        new InternalSystemClock().pauseFor( var );
    }
}
