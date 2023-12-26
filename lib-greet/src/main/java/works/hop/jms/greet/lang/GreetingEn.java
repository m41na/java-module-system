package works.hop.jms.greet.lang;

import works.hop.jms.greet.spi.Greeting;

public class GreetingEn implements Greeting {

    @Override
    public String language() {
        return "En";
    }

    @Override
    public String content(){
        return "Hello world!";
    }
}