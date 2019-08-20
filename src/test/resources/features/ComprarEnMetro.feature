#Author: Angela Maria Serna Arango

  @ComprarEnMetro
  Feature: Como usuario quiero ingresar a la pagina web de Metro Cencosud y comprar un producto

    @CasoExitoso
    Scenario: Comprar televisor smart en el sitio web Metro de Cencosud
      Given Yo como comprador
      When Requiero agregar un televisor con Philips LED 55PUD6513 ULTRA HD 4K
      Then Validar carrito de compras