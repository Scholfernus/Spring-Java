package sda.tasks.task4;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DummyLogger {
    protected void sayHello() {
    log.info("Hi from task 4");
    }
}
