package patterns.strategyPattern;

import patterns.strategyPattern.payments.PayPalStrategy;
import patterns.strategyPattern.shopping.Item;
import patterns.strategyPattern.shopping.ShoppingCart;

public class ShoppingCartTest {
    public static void main(String[] args) {

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(new Item("1245", 10));
        shoppingCart.addItem(new Item("1234", 12));
        shoppingCart.addItem(new Item("1243", 111));

        shoppingCart.pay(new PayPalStrategy("email@id.com", "xyz"));

    }
}
