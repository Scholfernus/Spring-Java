package pizza;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pizza.config.ConfigurationClass;
import pizza.implementation.Order;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
        Order order = (Order) context.getBean("Hawajska");
        Order order1 = (Order)context.getBean(Order.class);
        order.printOrder();
        order1.printOrder();
    }
}
