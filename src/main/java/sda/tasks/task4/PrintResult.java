package sda.tasks.task4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class PrintResult {
    @Autowired
    private DummyLogger dummyLogger;
    @Autowired
    private ListUtil listUtil;
    @Autowired
    private StringUtil stringUtil;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(PrintResult.class, args);
        PrintResult printResult = context.getBean(PrintResult.class);
        printResult.print();
    }

    public void print() {
        dummyLogger.sayHello();
        int sum = listUtil.sumElements(List.of(1, 2, 3));
        String sentence = stringUtil.formSentence(List.of("Goodbye", "cruel", "world"));

        System.out.println("Suma wszystkich elementów, to " + sum);
        System.out.println(sentence);
    }
}
