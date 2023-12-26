package works.hop.jms.greet.lang;

import works.hop.jms.greet.spi.Greeting;

public class GreetingEs implements Greeting {

    @Override
    public String language() {
        return "Es";
    }

    @Override
    public String content(){
        return "Hola mundo!";
    }
}