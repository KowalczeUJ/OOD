package decorator.topping;

import java.math.BigDecimal;

public class ChocolateTopping implements Topping {

    private static final BigDecimal PRICE = new BigDecimal("3.00");

    @Override
    public String getName() {
        return " chocolate topping ";
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
