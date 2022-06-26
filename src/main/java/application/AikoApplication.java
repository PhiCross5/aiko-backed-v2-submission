package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * this class is the starting point for the rest of the project.
 * with the help of springboot annotations it initializes service classes,
 * controller classes, entity classes, repository classes and more.
 * @author neido
 *
 */

@SpringBootApplication
public class AikoApplication {
	public static void main(String[] args) {
		SpringApplication.run(AikoApplication.class, args);

	}

}
