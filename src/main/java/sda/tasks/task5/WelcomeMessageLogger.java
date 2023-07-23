package sda.tasks.task5;
import org.springframework.beans.factory.annotation.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import static java.lang.Boolean.TRUE;

@Slf4j
@Component
public class WelcomeMessageLogger {

    private String text;
    private Boolean shouldLog;

    public WelcomeMessageLogger(@Value("${pl.sdacademy.welcome.text.value:ssssssssssssss}")String text,
                                @Value("${pl.sdacademy.welcome.text.enabled}") Boolean shouldLog) {
        this.text = text;
        this.shouldLog = shouldLog;
    }

//    @Override
//    public void run(String... args) throws Exception {
//        if (TRUE.equals(shouldLog)){
//            log.info(text);
//        }
//    }
}
