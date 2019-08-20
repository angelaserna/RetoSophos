package co.com.proyectobase.screenplay.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl( "https://www.metro.pe/especiales/cybermetro" )

public class WebMetroPage extends PageObject {

    public static final Target POPUP = Target.the( "popup metro" ).located( By.xpath( "//*[@id=\'normal-popover\']/div[1]" ) );
    public static final Target BTN_CANCELAR = Target.the( "boton cancelar" ).located( By.xpath( "//*[@id=\'onesignal-popover-cancel-button\']" ));
    public static final Target CMB_BUSQUEDA = Target.the( "campo busqueda" ).located( By.id( "search-autocomplete-input" ) );
    public static final Target LST_PRODUCTOS = Target.the( "lista de productos" ).located( By.xpath( "//*/div/ul/li['{0}']/div[1]/div[3]/div[1]/a" ) );
    public static final Target BTN_AGREGAR = Target.the( "boton agregar" ).located( By.xpath( "//*/div/ul/li['{0}']/div[1]/div[3]/div[5]/button" ) );
    public static final Target CARRITO = Target.the( "carrito de compras" ).located( By.xpath( "//*/div/ul/li['{0}']/div[2]/span[3]" ) );


}
