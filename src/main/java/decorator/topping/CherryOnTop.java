package decorator.topping;

import java.math.BigDecimal;

public class CherryOnTop implements Topping {

    private static final BigDecimal PRICE = new BigDecimal("1.00");

    @Override
    public String getName() {
        return " a cherry on top.";
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
