package sda.tasks.task3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@Primary
public class SecondBeanDummyLogger implements DummyLogger {

    @Override
    public void sayHello() {
        log.info("Hi, this is second bean");
    }
}
