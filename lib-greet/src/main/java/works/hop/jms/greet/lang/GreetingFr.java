package works.hop.jms.greet.lang;

import works.hop.jms.greet.spi.Greeting;

public class GreetingFr implements Greeting {

    @Override
    public String language() {
        return "Fr";
    }

    @Override
    public String content(){
        return "Bonjour monde!";
    }
}