package sda.tasks.task4;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class StringUtil {
    public String formSentence(final List<String>words){
        return words.stream().collect(Collectors.joining(" ", "","."));
    }
}
