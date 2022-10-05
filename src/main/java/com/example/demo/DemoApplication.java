package com.example.demo;

import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {
	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(UsuarioRepository repository) {
		return (args) -> {
			// save a few customers
			repository.save(new Usuario("alfredo","alfredo@gmail.com"));
			repository.save(new Usuario("ana maria","anamaria@gmail.com"));
			repository.save(new Usuario("pablo","pablo@gmail.com"));
			repository.save(new Usuario("daniel","daniel@gmail.com"));

			for (Usuario customer : repository.findAll()) {
				log.info(customer.toString());
			}
		};
	}
}
