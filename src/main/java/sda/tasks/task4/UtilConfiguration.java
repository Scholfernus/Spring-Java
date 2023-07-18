package sda.tasks.task4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class UtilConfiguration {
    @Bean
    @Primary
    public DummyLogger customDummyLogger(){
        return new DummyLogger();
    }
    @Bean
    public ListUtil listUtil(){
        return new ListUtil();
    }
    @Bean(name="stringUtility")
    public StringUtil stringUtil(){
        return new StringUtil();
    }
}
