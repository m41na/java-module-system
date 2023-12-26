module java.module.system.drink.app.main {

    requires java.module.system.api.service.main;
    uses works.hop.jms.drink.spi.Drink;
    provides works.hop.jms.drink.spi.Drink with works.hop.jms.drink.none.NoDrink;
}