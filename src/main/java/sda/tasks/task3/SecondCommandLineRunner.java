package sda.tasks.task3;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SecondCommandLineRunner implements CommandLineRunner {
    private final DummyLogger dummyLogger;

    public SecondCommandLineRunner(@Qualifier("secondBeanDummyLogger") final DummyLogger dummyLogger) {
        this.dummyLogger = dummyLogger;
    }
    @Override
    public void run(String... args) throws Exception {
        dummyLogger.sayHello();
    }
}
