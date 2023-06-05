package br.com.microservicoServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //faz a configuração do eureka server
public class MicroservicoServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicoServerApplication.class, args);
	}

}
