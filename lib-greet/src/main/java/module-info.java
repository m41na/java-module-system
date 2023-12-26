module java.module.system.lib.greeting.main {
    
    requires java.module.system.api.service.main;
    provides works.hop.jms.greet.spi.Greeting with
            works.hop.jms.greet.lang.GreetingEn,
            works.hop.jms.greet.lang.GreetingEs,
            works.hop.jms.greet.lang.GreetingFr;
}