package sda.tasks.task3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class FirstAndSecondCommandLineRunner implements CommandLineRunner {
    private final List<DummyLogger> dummyLoggerList;

    public FirstAndSecondCommandLineRunner(List<DummyLogger> dummyLoggerList) {
        this.dummyLoggerList = dummyLoggerList;
    }

    @Override
    public void run(String... args) throws Exception {
        dummyLoggerList.forEach(DummyLogger::sayHello);
    }
}
