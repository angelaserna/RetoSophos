package co.com.proyectobase.screenplay.stepdefinitions;

import co.com.proyectobase.screenplay.questions.Verificar;
import co.com.proyectobase.screenplay.tasks.AbrirNavegador;
import co.com.proyectobase.screenplay.tasks.Agregar;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class ComprarEnMetroStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Actor usuario = Actor.named( "usuario" );

    @Before
    public void configuracionInicial(){
        usuario.can( BrowseTheWeb.with( hisBrowser ) );
    }

    @Given("^Yo como comprador$")
    public void yoComoComprador() {
        usuario.wasAbleTo( AbrirNavegador.sitioWebMetro() );
    }

    @When("^Requiero agregar un (.*) con (.*)$")
    public void requieroAgregarUnTelevisorConReferencia(String producto, String referencia) {
        usuario.attemptsTo( Agregar.alCarrito(producto, referencia) );
    }

    @Then("^Validar carrito de compras$")
    public void validarCarritoDeCompras() {
        String resultadoEsperado = "en el carrito";
        usuario.should( GivenWhenThen.seeThat( Verificar.carrito( resultadoEsperado) ) );
    }

}
