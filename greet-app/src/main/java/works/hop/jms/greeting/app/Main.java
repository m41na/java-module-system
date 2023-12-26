package works.hop.jms.greeting.app;

import works.hop.jms.greet.spi.Greeting;
import works.hop.jms.greeting.provider.GreetingService;

public class Main {

    public static void main(String[] args) {
        Greeting svc = GreetingService.load("Fr");
        System.out.println(svc.content());
    }
}