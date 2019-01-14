package decorator;

import decorator.cake.Cake;
import decorator.topping.Topping;

import java.math.BigDecimal;

public class ToppingDecorator extends CakeDecorator {

    Cake cake;
    Topping topping;

    public ToppingDecorator(Topping topping, Cake cake) {
        this.topping = topping;
        this.cake = cake;
    }

    @Override
    public String bake() {
        return cake.bake().contains("with")
                ? cake.bake() + "and" + addTopping()
                : cake.bake() + "with" + addTopping();
    }

    @Override
    public BigDecimal getPrice() {
        return cake.getPrice().add(getSubTotal());
    }

    @Override
    String addTopping() {
        return topping.getName();
    }

    @Override
    BigDecimal getSubTotal() {
        return topping.getPrice();
    }
}
