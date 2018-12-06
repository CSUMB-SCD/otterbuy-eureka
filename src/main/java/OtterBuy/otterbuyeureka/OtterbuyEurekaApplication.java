package OtterBuy.otterbuyeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableEurekaServer
@SpringBootApplication
public class OtterbuyEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(OtterbuyEurekaApplication.class, args);
	}
}
