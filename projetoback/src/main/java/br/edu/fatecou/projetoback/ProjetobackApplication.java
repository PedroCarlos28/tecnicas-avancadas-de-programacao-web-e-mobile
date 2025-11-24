package br.edu.fatecou.projetoback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetobackApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProjetobackApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var pessoa = new Pessoa();
		pessoa.set
	}
}
