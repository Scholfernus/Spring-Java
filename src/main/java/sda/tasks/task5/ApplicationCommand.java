package sda.tasks.task5;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Getter
@Component
@Slf4j
public class ApplicationCommand implements CommandLineRunner {
    private final WelcomeMessageLogger welcomeMessageLogger;

    public ApplicationCommand(WelcomeMessageLogger welcomeMessageLogger) {
        this.welcomeMessageLogger = welcomeMessageLogger;
    }


    @Override
    public void run(String... args) throws Exception {
        if (welcomeMessageLogger.equals(true)){
            log.info(welcomeMessageLogger.toString());
        }
    }
}
