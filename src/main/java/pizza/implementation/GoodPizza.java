package pizza.implementation;

import pizza.Pizza;

public class GoodPizza implements Pizza {
    private int price;
    private String name;

    public GoodPizza(int price, String name) {
        super();
        this.price = price;
        this.name = name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }
}
