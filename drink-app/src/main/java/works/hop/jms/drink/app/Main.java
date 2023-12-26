package works.hop.jms.drink.app;

import works.hop.jms.drink.spi.Drink;

import java.util.ServiceLoader;

public class Main {

    public static void main(String[] args) {
        ServiceLoader<Drink> loader = ServiceLoader.load(Drink.class);
        loader.iterator().forEachRemaining(drink ->
                System.out.printf("%s drink of size %d%n", drink.getName(), drink.getSize()));
    }
}