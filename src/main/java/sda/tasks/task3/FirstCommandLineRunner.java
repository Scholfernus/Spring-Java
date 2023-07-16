package sda.tasks.task3;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class FirstCommandLineRunner implements CommandLineRunner {
    private final DummyLogger dummyLogger;
    @Override
    public void run(String... args) throws Exception {
        dummyLogger.sayHello();
    }
}
