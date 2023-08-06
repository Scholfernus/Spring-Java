package pizza.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pizza.Pizza;
import pizza.implementation.GoodPizza;
import pizza.implementation.Order;

import javax.swing.plaf.PanelUI;

@Configuration
public class ConfigurationClass {
    @Bean
    public Pizza pizza() {
        return new GoodPizza(15, "Klasyczna");
    }

    @Bean(name = "Hawajska")
    public Order order(Pizza pizza) {
        return new Order(pizza);
    }
}
