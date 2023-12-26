module java.module.system.lib.milk.main {

    requires java.module.system.api.service.main;
    provides works.hop.jms.drink.spi.Drink with works.hop.jms.drink.milk.Milk;
}