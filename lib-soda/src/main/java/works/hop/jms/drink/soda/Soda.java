package works.hop.jms.drink.soda;

import works.hop.jms.drink.spi.Drink;

public class Soda implements Drink {

    @Override
    public String getName() {
        return Drink.SODA;
    }

    @Override
    public int getSize() {
        return 2;
    }
}
