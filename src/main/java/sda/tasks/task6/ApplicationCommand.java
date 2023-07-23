package sda.tasks.task6;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class ApplicationCommand implements CommandLineRunner {

    private final Task6Properties properties;

    @Override
    public void run(String... args) throws Exception {
        log.info(properties.toString());
    }
}

