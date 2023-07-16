package sda.tasks.task2.commands;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CommandLineRunnerWithConstructorInjection implements CommandLineRunner {

    private final DummyLogger dummyLogger;
    @Override
    public void run(String... args) throws Exception {
    dummyLogger.sayHello();
    }
}
