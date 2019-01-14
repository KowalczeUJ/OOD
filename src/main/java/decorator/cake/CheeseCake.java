package decorator.cake;

import java.math.BigDecimal;

public class CheeseCake implements Cake {

    private static final BigDecimal BASE_PRICE = new BigDecimal("12.00");

    @Override
    public String bake() {
        return "Cheese cake ";
    }

    @Override
    public BigDecimal getPrice() {
        return BASE_PRICE;
    }
}
