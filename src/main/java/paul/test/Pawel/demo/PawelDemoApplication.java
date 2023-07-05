package paul.test.Pawel.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PawelDemoApplication implements CommandLineRunner {
@Autowired
UserService userService;
	public static void main(String[] args) {

		SpringApplication.run(PawelDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	userService.registerUser("Paul");
	}
}
