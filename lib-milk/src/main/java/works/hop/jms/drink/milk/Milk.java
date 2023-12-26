package works.hop.jms.drink.milk;

import works.hop.jms.drink.spi.Drink;

public class Milk implements Drink {

    @Override
    public String getName() {
        return Drink.MILK;
    }

    @Override
    public int getSize() {
        return 2;
    }
}
