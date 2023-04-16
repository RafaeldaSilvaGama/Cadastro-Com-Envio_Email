package br.com.fiap.estacionamento;

import br.com.fiap.estacionamento.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Checkpoint1Application {

	@Autowired
	private EmailService emailService;

	public static void main(String[] args) {
		SpringApplication.run(Checkpoint1Application.class, args);
	}

}
