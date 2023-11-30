package br.com.larissa.spring.data;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import br.com.larissa.spring.data.orm.Cargo;
import br.com.larissa.spring.data.repository.CargoRepository;

import java.util.Scanner;

@SpringBootApplication
public class SpringDataApplication implements CommandLineRunner {

	private final CargoRepository repository;

	public SpringDataApplication(CargoRepository repository) {
		this.repository = repository;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);


		Cargo cargo = new Cargo();
		cargo.setDescricao("Desenvolvedor de Software");

		repository.save(cargo);
	}
}
