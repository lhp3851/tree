package authentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableDiscoveryClient
public class AuthenticatiionApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthenticatiionApplication.class, args);
	}

}
