package sda.tasks.task8;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NamedPairs {
    private String name;
    Map<String,String> pairs;
}
