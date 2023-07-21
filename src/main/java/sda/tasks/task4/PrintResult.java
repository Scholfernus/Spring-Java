package sda.tasks.task4;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Slf4j
@Component
@RequiredArgsConstructor
@SpringBootApplication
public class PrintResult implements CommandLineRunner {
    @Autowired
    private DummyLogger dummyLogger;
    @Autowired
    private ListUtil listUtil;
    @Autowired
    private StringUtil stringUtil;
    private final ApplicationContext applicationContext;


    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(PrintResult.class, args);
        PrintResult printResult = context.getBean(PrintResult.class);
        printResult.print();
    }

    public void print() {
        dummyLogger.sayHello();
        int sum = listUtil.sumElements(List.of(1, 2, 3));
        String sentence = stringUtil.formSentence(List.of("Goodbye", "cruel", "world."));

        System.out.println("Suma wszystkich elementów, to " + sum);
        System.out.println(sentence);
    }

    @Override
    public void run(String... args) throws Exception {
        Set<String> beanNames =
                Arrays.stream(applicationContext.getBeanDefinitionNames())
                        .filter(b -> !b.contains("."))
                        .collect(Collectors.toSet());
        final Set<String> correctNames = Set.of("dummyLogger", "listUtility",
                "stringUtility");
        log.info("Zadanie rozwiązanie poprawne? {}", beanNames.containsAll(correctNames));
    }
}
