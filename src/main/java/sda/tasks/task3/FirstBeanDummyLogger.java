package sda.tasks.task3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class FirstBeanDummyLogger implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
      log.info("Hello this is first Bean");
    }
}
