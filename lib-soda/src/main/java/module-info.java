module java.module.system.lib.soda.main {

    requires java.module.system.api.service.main;
    provides works.hop.jms.drink.spi.Drink with works.hop.jms.drink.soda.Soda;
}