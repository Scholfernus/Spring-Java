package sda.tasks.task2.commands;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DummyLogger {
    public void sayHello(){
      log.info("Hello from DummyLogger");
    }
}
