package works.hop.jms.drink.water;

import works.hop.jms.drink.spi.Drink;

public class Water implements Drink {

    @Override
    public String getName() {
        return Drink.WATER;
    }

    @Override
    public int getSize() {
        return 2;
    }
}
