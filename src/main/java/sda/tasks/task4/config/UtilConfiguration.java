package sda.tasks.task4.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import sda.tasks.task4.DummyLogger;
import sda.tasks.task4.ListUtil;
import sda.tasks.task4.StringUtil;

@Configuration
public class UtilConfiguration {
    @Bean
    @Primary
    public DummyLogger dummyLogger(){
        return new DummyLogger();
    }
    @Bean
    public ListUtil listUtility(){
        return new ListUtil();
    }
    @Bean(name="stringUtility")
    public StringUtil stringUtil(){
        return new StringUtil();
    }
}
