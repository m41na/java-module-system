package works.hop.jms.drink.none;

import works.hop.jms.drink.spi.Drink;

public class NoDrink implements Drink {

    @Override
    public String getName() {
        return "No Drink";
    }

    @Override
    public int getSize() {
        return 0;
    }
}
