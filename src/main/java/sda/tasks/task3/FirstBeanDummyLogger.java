package sda.tasks.task3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class FirstBeanDummyLogger implements DummyLogger {

    @Override
    public void sayHello() {
        log.info("Hi, this is first bean");
    }
}
