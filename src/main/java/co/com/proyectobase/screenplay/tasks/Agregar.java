package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.interactions.Buscar;
import co.com.proyectobase.screenplay.interactions.Seleccionar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Agregar implements Task {

    private String producto;
    private String referencia;

    public Agregar(String producto, String referencia){
        this.producto = producto;
        this.referencia = referencia;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo( Buscar.existencia(producto) );
        actor.attemptsTo( Seleccionar.producto(referencia) );
    }

    public static Agregar alCarrito( String producto, String referencia) {
        return Tasks.instrumented( Agregar.class, producto, referencia );
    }
}
