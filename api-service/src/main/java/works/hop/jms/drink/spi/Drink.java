package works.hop.jms.drink.spi;

public interface Drink {

    String SODA = "SODA";
    String JUICE = "JUICE";
    String MILK = "MILK";
    String WATER = "WATER";

    String getName();

    int getSize();
}
