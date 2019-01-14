package decorator.topping;

import java.math.BigDecimal;

public class BiscuitTopping implements Topping {

    private static final BigDecimal PRICE = new BigDecimal("5.00");

    @Override
    public String getName() {
        return " biscuit topping ";
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }

}
