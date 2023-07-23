package spring.boot.web.api.endpoints;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EndPointExample {
@GetMapping("/paulDemo")
    public String getSomeValue()
    {return "Hello World, this is my first web application " +
            " P A U L        W E B S I T E ";}
}
