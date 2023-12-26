package works.hop.jms.drink.juice;

import works.hop.jms.drink.spi.Drink;

public class Juice implements Drink {
    @Override
    public String getName() {
        return Drink.JUICE;
    }

    @Override
    public int getSize() {
        return 2;
    }
}
