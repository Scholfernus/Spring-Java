package sda.tasks.task4;

import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ListUtil {
    public int sumElements(final List<Integer> integers) {
        return integers.stream().reduce(0, Integer::sum);
    }
}
