package fr.dawan.trivian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"fr.dawan.trivian"})
@EntityScan("fr.dawan.trivian.entities")
@EnableJpaRepositories("fr.dawan.trivian.repositories")
public class TrivianApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrivianApplication.class, args);
	}

}
