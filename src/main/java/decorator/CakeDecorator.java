package decorator;

import decorator.cake.Cake;

import java.math.BigDecimal;

public abstract class CakeDecorator implements Cake {

    abstract String addTopping();

    abstract BigDecimal getSubTotal();

}
