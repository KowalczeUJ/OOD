package decorator.cake;

import java.math.BigDecimal;

public class ApplePie implements Cake {

    private static final BigDecimal BASE_PRICE = new BigDecimal("10.00");

    @Override
    public String bake() {
        return "Apple pie ";
    }

    @Override
    public BigDecimal getPrice() {
        return BASE_PRICE;
    }
}
