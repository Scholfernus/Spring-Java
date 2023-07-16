package sda.tasks.task2.commands;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerWithSetterInjection implements CommandLineRunner {

    private DummyLogger dummyLogger;
    @Override
    public void run(String... args) throws Exception {
        dummyLogger.sayHello();
    }
    @Autowired
    public void setDummyLogger(DummyLogger dummyLogger) {
        this.dummyLogger = dummyLogger;
    }
}
