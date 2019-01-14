package decorator;

import decorator.cake.Cake;
import decorator.cake.CheeseCake;
import decorator.topping.BiscuitTopping;
import decorator.topping.CherryOnTop;
import decorator.topping.ChocolateTopping;

public class Main {

    public static void main(String[] args) {
        Cake cheeseCake = new CheeseCake();
        System.out.println(cheeseCake.bake());
        System.out.println(cheeseCake.getPrice());

        System.out.println("\n");

        Cake cheeseCakeWithChocolateTopping = new ToppingDecorator(new ChocolateTopping(), new CheeseCake());
        System.out.println(cheeseCakeWithChocolateTopping.bake());
        System.out.println(cheeseCakeWithChocolateTopping.getPrice());

        Cake cheeseCakeWithChocolateAndBiscuitTopping = new ToppingDecorator(new BiscuitTopping(), cheeseCakeWithChocolateTopping);
        System.out.println(cheeseCakeWithChocolateAndBiscuitTopping.bake());
        System.out.println(cheeseCakeWithChocolateAndBiscuitTopping.getPrice());

        Cake cheeseCakeWithChocolateAndBiscuitToppingAndACherryOnTop = new ToppingDecorator(new CherryOnTop(), cheeseCakeWithChocolateAndBiscuitTopping);
        System.out.println(cheeseCakeWithChocolateAndBiscuitToppingAndACherryOnTop.bake());
        System.out.println(cheeseCakeWithChocolateAndBiscuitToppingAndACherryOnTop.getPrice());
    }

}
