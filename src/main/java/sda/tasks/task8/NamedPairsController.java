package sda.tasks.task8;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
public class NamedPairsController {

    @GetMapping("/api/pairs/{name}")
    public NamedPairs getNamedPairs(@PathVariable("name") String name) {
        return NamedPairs.builder()
                .name(name)
                .pairs(Collections.emptyMap())
                .build();
    }
}
