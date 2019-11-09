package za.co.simplitate.stockdatabaseservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "za.co.simplitate.stockdatabaseservice.repository")
@SpringBootApplication
public class StockDatabaseServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockDatabaseServiceApplication.class, args);
	}

}
