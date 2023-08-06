package pizza.implementation;

import pizza.Orders;
import pizza.Pizza;

public class Order implements Orders {
    private Pizza pizza;

    public Order(Pizza pizza) {
        super();
        this.pizza = pizza;
    }

    @Override
    public void printOrder() {
        System.out.println("Zamówienie : " + pizza.getName() + " cena: " + pizza.getPrice());
    }
}
