package sda.tasks.task9;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import java.util.Random;

@Component
@RequestScope
public class RandomBooleanProvider {
    private final boolean value = new Random().nextBoolean();

    public boolean getValue() {
        return value;
    }
}